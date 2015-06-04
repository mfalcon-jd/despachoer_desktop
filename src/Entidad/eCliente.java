package Entidad;

import java.util.Date;

public class eCliente {
	String curp;
	String nombre;
	String apellido_paterno;
	String apellido_materno;
	String direccion;
	Date fecha_nacimiento;
	String email;
	String observaciones;
	
	public eCliente()
	{
		
	}
	
	public eCliente(String curp, String nombre, String apellido_paterno, String apellido_materno, String direccion, Date fecha_nacimiento, String email, String observaciones)
	{
		this.curp = curp;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.email = email;
		this.observaciones = observaciones;
	}
	
	public String getCurp()
	{
		return curp;
	}
	
	public void setCurp(String curp)
	{
		this.curp = curp;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getApellidoPaterno()
	{
		return apellido_paterno;
	}
	
	public void setApellidoPaterno(String apellido_paterno)
	{
		this.apellido_paterno = apellido_paterno;
	}
	
	public String getApellidoMaterno()
	{
		return apellido_paterno;
	}
	
	public void setApellidoMaterno(String apellido_materno)
	{
		this.apellido_materno = apellido_materno;
	}
	
	public String getDireccion()
	{
		return direccion;
	}
	
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	
	public Date getFechaNacimiento()
	{
		return fecha_nacimiento;
	}
	
	public void setFechaNacimiento(Date fecha_nacimiento)
	{
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getObservaciones()
	{
		return observaciones;
	}
	
	public void setObservaciones(String observaciones)
	{
		this.observaciones = observaciones;
	}
}
