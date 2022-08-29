package br.com.dicob.model;

public class Group {
	
	private int idGroup;
	private String nameGroup;
	private String categoriaGroup;
	
	public Group(int idGroup, String nameGroup, String categoriaGroup){
		this.idGroup = idGroup;
		this.nameGroup = nameGroup;
		this.categoriaGroup = categoriaGroup;
	}	
	
	public Group(){}

	public int getIdGroup() {
		return idGroup;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public String getCategoriaGroup() {
		return categoriaGroup;
	}

	public void setCategoriaGroup(String categoriaGroup) {
		this.categoriaGroup = categoriaGroup;
	}
	
	
}
