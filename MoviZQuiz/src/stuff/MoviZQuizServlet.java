package stuff;

import java.io.IOException;

import javax.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

@SuppressWarnings("serial")
public class MoviZQuizServlet extends HttpServlet {
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.getWriter().println("creating query");
		List<Entity> l=getMovies();
		System.out.println(l);
		resp.getWriter().println("done");
	}
	private List<Entity> getMovies() {
	    Query q =
			    new Query("Movie")
			        .setFilter(new FilterPredicate("movies", FilterOperator.EQUAL, "m01"));

			PreparedQuery pq = datastore.prepare(q);
			return pq.asList(FetchOptions.Builder.withLimit(5));
	  }
}
