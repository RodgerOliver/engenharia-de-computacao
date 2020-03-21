class Basic {
	public static boolean isInteger(Object object) {
		if(object instanceof Integer) {
			return true;
		} else {
			String string = object.toString();
			try {
				Integer.parseInt(string);
			} catch(Exception e) {
				return false;
			}
		}
		return true;
	}

	public static boolean isFloat(Object object) {
		if(object instanceof Integer) {
			return true;
		} else {
			String string = object.toString();
			try {
				Float.parseFloat(string);
			} catch(Exception e) {
				return false;
			}
		}
		return true;
	}
}
