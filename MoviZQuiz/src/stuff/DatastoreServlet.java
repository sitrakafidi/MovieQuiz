package stuff;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Query;

@SuppressWarnings("serial")
public class DatastoreServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		//DbpediaQuery dbq = new DbpediaQuery();
		//dbq.queryDbpedia();
		resp.getWriter().println("creating movies\n");


		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		//int max=10;
		//for (int i = 0; i < max; i++) {
			/*Entity e = new Entity("Movie", "m" + i);
			e.setProperty("title", dbq.getTitles().get(i));
			e.setProperty("director", dbq.getDirectors().get(i));
			e.setProperty("year", dbq.getYears().get(i));*/
			
			Entity e = new Entity("Movie","m1");
			e.setProperty("title", "1994");
			e.setProperty("director", "Elmo Nüganen");
			e.setProperty("year", "2015");
			
			datastore.put(e);
			
			Entity e2 = new Entity("Movie","m2");
			e2.setProperty("title", "Cornouaille");
			e2.setProperty("director", "Anne Le Ny");
			e2.setProperty("year", "2012");
			Key k = e2.getKey();
			datastore.put(e2);
			Query query = new Query("Movie");
			////////////
			List<Entity> guests = datastore.prepare(query ).asList(FetchOptions.Builder.withLimit(5));
			resp.getWriter().println(+guests.size()+"films");
			for (Entity guest : guests) {
		    String titre = (String) guest.getProperty("title");
		    String directeur = (String) guest.getProperty("director");
		    Object annee =  guest.getProperty("year");
		    resp.getWriter().println("\n Titre : "+titre+"\t+ Directeur : "+directeur+"\tAnnee : "+annee.toString());
		  }
			
			
			///////////
//			
//			try {
//				Entity data = datastore.get(k);
//				if(data == null){
//					resp.getWriter().println("Data est vide");
//				}
//				resp.getWriter().println(data.toString());
//			} catch (EntityNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
		//}
		resp.getWriter().println("done!!!!!!!");
	}
}