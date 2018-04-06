package reflexion.test.to;

import reflexion.test.annotations.CustomQuery;
import reflexion.test.annotations.Field;

@CustomQuery(from = "Product AS p", where = "p.code = ?code" )
public class ResultadoTO {

	@Field(value = "{p.name}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
