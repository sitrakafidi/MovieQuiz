package stuff;

import java.util.List;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class QuestionEntity {
	
	@PrimaryKey
	@Persistent(valueStrategy=IdGeneratorStrategy.IDENTITY)
	String id;

	@Persistent
	String body;
	
	@Persistent
	List<String> choices;
	
	@Persistent
	int answer;
	
	@Persistent
	int type;
	
	public QuestionEntity(String id, String body, List<String> choices, int answer, int type) {
		super();
		this.id = id;
		this.body = body;
		this.choices = choices;
		this.answer = answer;
		this.type = type;
	}
	
	public QuestionEntity(String body, List<String> choices, int answer, int type) {
		super();
		this.id = Integer.toString(this.hashCode());
		this.body = body;
		this.choices = choices;
		this.answer = answer;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getQuestion() {
		return body;
	}
	
	public void setQuestion(String question) {
		this.body = question;
	}
	
	public List<String> getchoices() {
		return this.choices;
	}
	
	public void setchoices(List<String> choices){
		this.choices = choices;
	}
	
	public int getanswer() {
		return answer;
	}
	
	public void setanswer(int answer) {
		this.answer = answer;
	}
	
	public int getType(){
		return this.type;
	}
	
	public void setType(int type){
		this.type = type;
	}
}
