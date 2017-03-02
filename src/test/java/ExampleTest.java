import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ExampleTest {
    Example subjectUnderTest;

    @Mock
    Collaborator collaborator;

    @Before
    public void setup() {
        subjectUnderTest = new Example(collaborator);
    }

    @Test
    public void callSomethingOnCollaborator_checkOutput() {
        String hello = "hello";
        when(collaborator.callSomething(hello)).thenReturn("yo");
        String result = subjectUnderTest.callSomethingOnCollaborator(hello);

        assertThat(result, is("yo"));
    }

    @Test
    public void callSomethingOnCollaborator_verifyCall() {
        subjectUnderTest.callSomethingOnCollaborator("hello");

        verify(collaborator).callSomething("hello");
    }

}
