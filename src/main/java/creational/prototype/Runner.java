package creational.prototype;

public class Runner {
    public static void main(String[] args) {
        Project master = new Project(1, "master", "SourceCode code = new SourceCode();");

        System.out.println(master);

        Project masterCopy = (Project) master.copy();
        System.out.println("\n ================================= \n");
        System.out.println(masterCopy);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterCopy2 = factory.cloneProject();
        System.out.println("\n ================================= \n");
        System.out.println(masterCopy2);
    }
}
