package creational.abstractFactory;

import creational.abstractFactory.webSite.WebSiteTeamFactory;

public class WebSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("webSite create...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
