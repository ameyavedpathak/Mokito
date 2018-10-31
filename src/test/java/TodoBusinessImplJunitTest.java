import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import com.mokito.api.TodoBusinessImpl;
import com.mokito.api.TodoService;
import com.mokito.api.TodoServiceStub;

import org.junit.Test;

public class TodoBusinessImplJunitTest {

	@Test
	public void testdata() 
	{
	  
		TodoService todoservice = new TodoServiceStub();
		TodoBusinessImpl obj = new TodoBusinessImpl(todoservice);
		
		//Test case to check the data of method		
		List<String> expected = Arrays.asList("node Coverage", "Edge Coverage", "Prime Coverage");
		assertEquals(expected,obj.retrieveTodosRelatedToTesting("user"));
				
	}

	@Test
	public void testsize() 
	{
	  
		TodoService todoservice = new TodoServiceStub();
		TodoBusinessImpl obj = new TodoBusinessImpl(todoservice);
		
		//Test case to check size of output from method
		assertEquals(3,obj.retrieveTodosRelatedToTesting("user").size());
		
	}

}
