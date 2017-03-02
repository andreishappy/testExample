public class Example {
    private Collaborator collaborator;

    public Example(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public String callSomethingOnCollaborator(String something) {
        return this.collaborator.callSomething(something);
    }
}
