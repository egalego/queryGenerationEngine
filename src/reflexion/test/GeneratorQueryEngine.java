package reflexion.test;

import java.lang.reflect.Method;

import reflexion.test.annotations.CustomQuery;
import reflexion.test.annotations.Field;
import reflexion.test.to.ResultadoTO;

public class GeneratorQueryEngine {

	public static String generateQuery(Class<?> clazz) {
		StringBuilder sb = new StringBuilder();

		sb.append("SELECT ");

		Class<?> obj = clazz;

		if (obj.isAnnotationPresent(CustomQuery.class)) {

			CustomQuery customQuery = (CustomQuery) obj.getAnnotation(CustomQuery.class);

			for (Method method : obj.getDeclaredMethods()) {
				if (method.isAnnotationPresent(Field.class)) {

					Field field = (Field) method.getAnnotation(Field.class);

					sb.append(" ");
					sb.append(field.value());
					sb.append(",");
				}
			}

			sb.append(" FROM { ");
			sb.append(customQuery.from());
			sb.append(" } ");

			sb.append(" WHERE ");
			sb.append(customQuery.where());

			sb.append(";");
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(generateQuery(ResultadoTO.class));
		
	}

}
