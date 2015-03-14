package za.ac.cput.project.chapter5;

public class DiplomaCourseDirector {
	private BuilderPattern diplomaCourseBuilder= null;
	public DiplomaCourseDirector(BuilderPattern diplomaCourseBuilder) {
	this.diplomaCourseBuilder = diplomaCourseBuilder;
	}
	public void constructDiplomaCourse(){
	diplomaCourseBuilder.buildDevelopmentSoftware();
	diplomaCourseBuilder.buildInformationSystems();
	diplomaCourseBuilder.buildTechnicalPrograming();
	diplomaCourseBuilder.buildInternetPrograming();
	}
	public DiplomaCourse getDiplomaCourse() {
	return diplomaCourseBuilder.getDiplomaCourse();
	}
}
