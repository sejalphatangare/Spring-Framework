package springcore.collections;
//injecting Collection types list,set,Map,properties

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phones;      //duplicates allowed and order maintained
	private Set<String> address;      //duplicates not allowed order not maintained
	private Map<String,String> courses; //key value pair
	private Properties props;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses,
			Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.props = props;
	}

	public Properties getProps() {
		return props;
	}


	public void setProps(Properties props) {
		this.props = props;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	
}
