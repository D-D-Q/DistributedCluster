package du.core;

public class TestServiceImpl implements TestService {

	@Override
	public String service(int i, String tag) {
		return i + ":" + tag;
	}
}
