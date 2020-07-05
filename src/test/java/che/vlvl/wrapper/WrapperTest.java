package che.vlvl.wrapper;

import che.vlvl.concepts.ConceptTypes;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

public class WrapperTest {

    Wrapper wrapper=new Wrapper();
    LinkedHashMap<String, ConceptTypes> exampleMap = new LinkedHashMap<>();

    @Before
    public void getWrapper(){
        exampleMap.put("Obama", ConceptTypes.ENTITY);
        exampleMap.put("visited", ConceptTypes.PLAIN_TEXT);
        exampleMap.put("Facebook", ConceptTypes.ENTITY);
        exampleMap.put("headquarters:", ConceptTypes.PLAIN_TEXT);
        exampleMap.put("http://bit.ly/xyz", ConceptTypes.LINK);
        exampleMap.put("@elversatile", ConceptTypes.TWITTER_USERNAME);
    }

    @Test
    public void wrapFeedTest_FilledLinkedHashMap_CorrectStringReturned(){

        String result = "<strong>Obama</strong> visited <strong>Facebook</strong> headquarters: @<a href=\"http://bit.ly/xyz\">http://bit.ly/xyz</a> @<a href=\"http://twitter.com/elversatile>elversatile</a>";
        assertEquals(result,wrapper.wrapFeed(exampleMap));
    }

    @Test
    public void wrapFeedTest_EmptyLinkedHashMap_EmptyStringReturned() {
        assertEquals("",wrapper.wrapFeed(new LinkedHashMap<>()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrapFeedTest_NullConceptTypeInMap_ThrowException(){
        LinkedHashMap<String, ConceptTypes> testMap=new LinkedHashMap<>();
        testMap.put("test",null);
        wrapper.wrapFeed(testMap);
    }
}