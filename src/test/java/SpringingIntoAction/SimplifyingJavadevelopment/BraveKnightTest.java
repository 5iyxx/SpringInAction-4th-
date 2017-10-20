package SpringingIntoAction.SimplifyingJavadevelopment;
import static org.mockito.Mockito.*;
import org.junit.Test;

import Springing.Simplifying.BraveKnight;
import Springing.Simplifying.Quest;

public class BraveKnightTest {

	@Test
	public void KnightShouldEmbarkOnQuest() {

		Quest mockQuest=mock(Quest.class);      //创建mock Quest
		BraveKnight knight=new BraveKnight(mockQuest); //注入mock Quest
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
	}
}
