package za.ac.cput.project.chapter5;

public class SecondYearDiplomaCourseBuilder implements BuilderPattern {
	private DiplomaCourse diplomaCourse;
	public SecondYearDiplomaCourseBuilder() {
	diplomaCourse = new DiplomaCourse();
	}
	@Override
	public void buildTechnicalPrograming() {
	diplomaCourse.setTechnicalPrograming("Technical Programming 1");
	}
	@Override
	public void buildInformationSystems() {
	diplomaCourse.setInformationSystems("Information System 2");
	}
	@Override
	public void buildInternetPrograming() {
	diplomaCourse.setInternetPrograming("Internet Programing 2");
	}
	@Override
	public void buildDevelopmentSoftware() {
	diplomaCourse.setDevelopmentSoftware("Development Software 2");
	}
	@Override
	public DiplomaCourse getDiplomaCourse() {
	return diplomaCourse;
	}
}