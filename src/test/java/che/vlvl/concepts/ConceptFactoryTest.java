package che.vlvl.concepts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConceptFactoryTest {

    ConceptFactory factory=new ConceptFactory();

    @Test
    public void getWrapperTest_PlainTextConceptWrapperReturned() {
        ConceptTypes plainTextConceptType = ConceptTypes.PLAIN_TEXT;
        Concept wrapper = factory.getWrapper(plainTextConceptType);
        Assert.assertEquals(PlainTextConcept.class,wrapper.getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWrapperTest_ThrowException(){

        Concept wrapper = factory.getWrapper(null);
    }

}