package nebula.tinyasm.analyze;

import java.util.Arrays;
import java.util.List;

import nebula.tinyasm.data.Field;

class MethodInfo {
	public String name;
	public Field[] params;
	public List<Variable> locals;

	public MethodInfo(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Method [name=" + name + ", params=" + Arrays.toString(params) + "]\n";
	}
}