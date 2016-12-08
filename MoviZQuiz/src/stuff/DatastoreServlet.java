package stuff;


import java.io.IOException;



import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class DatastoreServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		DbpediaQuery dbq = new DbpediaQuery();
		dbq.queryDbpedia();
		resp.getWriter().println("creating movies");


		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		int max=10;
		for (int i = 0; i < max; i++) {
			Entity e = new Entity("Movie", "m" + i);
			e.setProperty("title", dbq.getTitles().get(i));
			e.setProperty("director", dbq.getDirectors().get(i));
			e.setProperty("year", dbq.getYears().get(i));
			
			datastore.put(e);
		}
		resp.getWriter().println("done");
	}
}
