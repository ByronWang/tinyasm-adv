package nebula.tinyasm.api;

import static nebula.tinyasm.util.TypeUtils.typeOf;

import java.util.function.Consumer;

import org.objectweb.asm.Type;

public interface MethodHeader<MC> extends MethodDefineParameter<MC> {

	default MethodHeader<MC> annotation(Class<?> annotationClass) {
		return annotation(typeOf(annotationClass), null);
	}

	default MethodHeader<MC> annotation(Class<?> annotationClass, Object value) {
		return annotation(typeOf(annotationClass), value);
	}

	default MethodHeader<MC> annotation(Class<?> annotationClass, String name, Object value) {
		return annotation(typeOf(annotationClass), name, value);
	}

	default MethodHeader<MC> annotation(Type type) {
		return annotation(type, null);
	}

	MethodHeader<MC> annotation(Type type, Object value);

	MethodHeader<MC> annotation(Type type, String name, Object value);

	MC codeBegin();

	void code(Consumer<MC> invocation);

	default MethodHeader<MC> parameterAnnotation(Class<?> annotationClass) {
		return parameterAnnotation(typeOf(annotationClass), null);
	}

	default MethodHeader<MC> parameterAnnotation(Type type) {
		return parameterAnnotation(type, null);
	}

	MethodHeader<MC> parameterAnnotation(Type type, Object value);
}