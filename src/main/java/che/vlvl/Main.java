package che.vlvl;

import che.vlvl.concepts.ConceptTypes;
import che.vlvl.wrapper.Wrapper;

import java.util.LinkedHashMap;


public class Main {
    public static void main(String[] args) {

        //Example LinkedHashMap with data
        LinkedHashMap<String, ConceptTypes> exampleMap = new LinkedHashMap<>();
        exampleMap.put("Obama", ConceptTypes.ENTITY);
        exampleMap.put("visited", ConceptTypes.PLAIN_TEXT);
        exampleMap.put("Facebook", ConceptTypes.ENTITY);
        exampleMap.put("headquarters:", ConceptTypes.PLAIN_TEXT);
        exampleMap.put("http://bit.ly/xyz", ConceptTypes.LINK);
        exampleMap.put("@elversatile", ConceptTypes.TWITTER_USERNAME);

        //Data output
        Wrapper wrapper = new Wrapper();
        System.out.println(wrapper.wrapFeed(exampleMap));
    }
}
