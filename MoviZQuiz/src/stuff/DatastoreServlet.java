package stuff;

import java.io.IOException;
import javax.servlet.http.*;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class DatastoreServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		//DbpediaQuery dbq = new DbpediaQuery();
		//dbq.queryDbpedia();
		resp.getWriter().println("creating movies");


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
			
			datastore.put(e2);
		//}
		resp.getWriter().println("done!!!!!!!");
	}
}
