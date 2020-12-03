package calculator;

/**
 * @author : byungkyu
 * @date : 2020/12/02
 * @description : 계산
 **/
public class Calculator {
	private int result;

	public Calculator() {
		result = 0;
	}

	public void calculate(String arg) {
		checkUserInput(arg);
	}

	private void checkUserInput(String arg) {
		checkUserInputEmpty(arg);
		checkUserInputValidPattern(arg);
	}

	private void checkUserInputValidPattern(String arg) {
		String[] splitValue = arg.split(" ");
		checkUserInputValidPatternOnLength(splitValue);
		checkUserInputValidPatternOnPosition(splitValue);
	}

	private void checkUserInputValidPatternOnPosition(String[] splitValue) {
		for (int i = 0; i < splitValue.length; i += 2) {
			checkNumeric(splitValue[i]);
		}

	}

	private void checkNumeric(String s) {
		try {
			int parseInt = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("계산식이 옳바르지 않습니다. 숫자와 연산자의 조합이 옳바르지 않습니다.");
		}
	}

	private void checkUserInputValidPatternOnLength(String[] splitValue) {
		if (splitValue.length == 1 || splitValue.length % 2 == 0)
			throw new IllegalArgumentException("계산식이 옳바르지 않습니다. 계산식이 없거나 계산식이 옳바르게 종료되지 않았습니다.");
	}

	private void checkUserInputEmpty(String arg) {
		if (arg.trim().isEmpty())
			throw new IllegalArgumentException("입력값이 존재하지 않습니다.");
	}
}
