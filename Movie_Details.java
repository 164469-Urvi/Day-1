
public class Movie_Details {
private String mov_Name,lead_actor,lead_actories, genre;

Movie_Details(String mov_Name,String lead_actor,String lead_actories,String genre)
{
	this.mov_Name=mov_Name;
	this.lead_actor=lead_actor;
	this.lead_actories=lead_actories;
	this.setGenre(genre);
}
public String getMov_Name()
{
	return mov_Name;
	
}
public void setMov_Name(String mov_Name)
{
	this.mov_Name=mov_Name;
}
public String getLead_actor() {
	return lead_actor;
}
public void setLead_actor(String lead_actor) {
	this.lead_actor = lead_actor;
}
public String getLead_actories() {
	return lead_actories;
}
public void setLead_actories(String lead_actories) {
	this.lead_actories = lead_actories;
}
public String toString()
{
	return mov_Name+" "+lead_actor+" "+lead_actories;
	
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
}