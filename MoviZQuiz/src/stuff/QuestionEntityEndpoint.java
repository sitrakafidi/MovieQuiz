package stuff;

import stuff.PMF;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "questionentityendpoint", namespace = @ApiNamespace(ownerDomain = "mycompany.com", ownerName = "mycompany.com", packagePath = "services"))
public class QuestionEntityEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listQuestionEntity")
	public CollectionResponse<QuestionEntity> listQuestionEntity(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<QuestionEntity> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(QuestionEntity.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<QuestionEntity>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (QuestionEntity obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<QuestionEntity> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getQuestionEntity")
	public QuestionEntity getQuestionEntity(@Named("id") String id) {
		PersistenceManager mgr = getPersistenceManager();
		QuestionEntity questionentity = null;
		try {
			questionentity = mgr.getObjectById(QuestionEntity.class, id);
		} finally {
			mgr.close();
		}
		return questionentity;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param questionentity the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertQuestionEntity")
	public QuestionEntity insertQuestionEntity(QuestionEntity questionentity) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (containsQuestionEntity(questionentity)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.makePersistent(questionentity);
		} finally {
			mgr.close();
		}
		return questionentity;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param questionentity the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateQuestionEntity")
	public QuestionEntity updateQuestionEntity(QuestionEntity questionentity) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsQuestionEntity(questionentity)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.makePersistent(questionentity);
		} finally {
			mgr.close();
		}
		return questionentity;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeQuestionEntity")
	public void removeQuestionEntity(@Named("id") String id) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			QuestionEntity questionentity = mgr.getObjectById(
					QuestionEntity.class, id);
			mgr.deletePersistent(questionentity);
		} finally {
			mgr.close();
		}
	}

	private boolean containsQuestionEntity(QuestionEntity questionentity) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(QuestionEntity.class, questionentity.getId());
		} catch (javax.jdo.JDOObjectNotFoundException ex) {
			contains = false;
		} finally {
			mgr.close();
		}
		return contains;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
