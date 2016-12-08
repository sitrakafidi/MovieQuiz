package stuff;

import java.util.ArrayList;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.Syntax;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;




public class DbpediaQuery {
	private ArrayList<String> titles;
	private ArrayList<String> directors;
	private ArrayList<String> years;
	
	public DbpediaQuery(){
		titles = new ArrayList<String>();
		directors = new ArrayList<String>();
		years = new ArrayList<String>();
	}
	
	public void queryDbpedia(){
		String queryString="PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
				+"PREFIX dc: <http://purl.org/dc/elements/1.1/>"
				+"PREFIX dbpedia-owl: <http://dbpedia.org/ontology/>"
				+"PREFIX prop-fr: <http://fr.dbpedia.org/property/>"
				+"SELECT DISTINCT ?movie ?title ?director_name ?year "
				+"WHERE {"
				+	"?movie dc:title ?title ."
				+	"?movie dbpedia-owl:director ?director."
				+	"?director prop-fr:nom ?director_name."
				+	"?movie prop-fr:annéeDeSortie ?year."
				+"FILTER(?year>2005) "

				+"} LIMIT 100";



	
	
	// now creating query object
	Query query = QueryFactory.create(queryString);
	// initializing queryExecution factory with remote service.
	// **this actually was the main problem I couldn't figure out.**
	QueryExecution qexec = QueryExecutionFactory.sparqlService("http://fr.dbpedia.org/sparql", query);

	//after it goes standard query execution and result processing which can
	// be found in almost any Jena/SPARQL tutorial.
	try {
	    ResultSet results = qexec.execSelect();
	    while ( results.hasNext()) {

	    // Result processing is done here.
	    //for(int i=0;i<results.getResultVars().size();++i){
	    	//System.out.println(results.nextSolution());
	    	//System.out.println(results.getRowNumber());
	    	QuerySolution sol = results.nextSolution() ;
	    	//titles
	    	RDFNode t = sol.get("title");
	    	titles.add(t.toString());
	    	
	    	//directors
	    	RDFNode d = sol.get("director_name");
	    	directors.add(d.toString().substring(0, d.toString().length()-3));
	    	
	    	//years
	    	RDFNode y = sol.get("year");
	    	years.add(y.toString().substring(0, 4));
	    }	
	}
	finally {
	   qexec.close();
	}

		
	}
	
	
	public ArrayList<String> getTitles() {
		return titles;
	}

	public ArrayList<String> getDirectors() {
		return directors;
	}

	public ArrayList<String> getYears() {
		return years;
	}

	public void afficherResultats(){
		for(int i=0;i<titles.size();++i){
			System.out.println("Film "+ i + " : ");
			System.out.println("Title : " + titles.get(i) + "    Director : " + directors.get(i) + "    Year : " + years.get(i) );
		}
	}
	
	
	public static void main(String[] args) {
		DbpediaQuery db = new DbpediaQuery();
		db.queryDbpedia();
		db.afficherResultats();
	}

}
