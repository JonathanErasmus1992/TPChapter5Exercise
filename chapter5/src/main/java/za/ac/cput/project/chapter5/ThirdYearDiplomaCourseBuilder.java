package za.ac.cput.project.chapter5;

public class ThirdYearDiplomaCourseBuilder implements BuilderPattern {
	private DiplomaCourse diplomaCourse;
	public ThirdYearDiplomaCourseBuilder() {
	diplomaCourse = new DiplomaCourse();
	}
	@Override
	public void buildTechnicalPrograming() {
	diplomaCourse.setTechnicalPrograming("Technical Programing 2");
	}
	@Override
	public void buildInformationSystems() {
	diplomaCourse.setInformationSystems("Information System 3");
	}
	@Override
	public void buildInternetPrograming() {
	diplomaCourse.setInternetPrograming("Internet Programming 3");
	}
	@Override
	public void buildDevelopmentSoftware() {
	diplomaCourse.setDevelopmentSoftware("Development Software 3");
	}
	@Override
	public DiplomaCourse getDiplomaCourse() {
	return diplomaCourse;
	}
}
