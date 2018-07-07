package org.distribuidos;

public class Carga_Data {
	
	   private String descripcion;
		private String serie;
		private String ciudad;
		private String ini_ciudad;
		private double data_2005;
		private double data_2006;
		private double data_2007;
		private double data_2008;
		private double data_2009;
		private double data_2010;
		private double data_2011;
		private double data_2012;
		private double data_2013;

	    public  Carga_Data (String descripcion, String serie, String ciudad, String ini_ciudad, double e, double f, double j, double h, double k, double d, double g, double i, double l) {
	        this.descripcion = descripcion;
	        this.serie = serie;
	        this.ciudad = ciudad;
	        this.ini_ciudad = ini_ciudad;
	        this.data_2005= e;
	        this.setData_2006(f);
	        this.setData_2007(j);
	        this.setData_2008(h);
	        this.setData_2009(k);
	        this.setData_2010(d);
	        this.setData_2011(g);
	        this.setData_2012(i);
	        this.setData_2013(l);
	    }



		public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public String getSerie() {
	        return serie;
	    }

	    public void setSerie(String serie) {
	        this.serie = serie;
	    }

	    public String getCiudad() {
	        return ciudad;
	    }

	    public void setCiudad(String ciudad) {
	        this.ciudad = ciudad;
	    }

	    public String getIni_ciudad() {
	        return ini_ciudad;
	    }

	    public void setIni_ciudad(String ini_ciudad) {
	        this.ini_ciudad = ini_ciudad;
	    }



		public double getData_2005() {
			return data_2005;
		}



		public void setData_2005(double data_2005) {
			this.data_2005 = data_2005;
		}



		public double getData_2006() {
			return data_2006;
		}



		public void setData_2006(double data_2006) {
			this.data_2006 = data_2006;
		}



		public double getData_2007() {
			return data_2007;
		}



		public void setData_2007(double data_2007) {
			this.data_2007 = data_2007;
		}



		public double getData_2008() {
			return data_2008;
		}



		public void setData_2008(double data_2008) {
			this.data_2008 = data_2008;
		}



		public double getData_2009() {
			return data_2009;
		}



		public void setData_2009(double data_2009) {
			this.data_2009 = data_2009;
		}



		public double getData_2010() {
			return data_2010;
		}



		public void setData_2010(double data_2010) {
			this.data_2010 = data_2010;
		}



		public double getData_2011() {
			return data_2011;
		}



		public void setData_2011(double data_2011) {
			this.data_2011 = data_2011;
		}



		public double getData_2012() {
			return data_2012;
		}



		public void setData_2012(double data_2012) {
			this.data_2012 = data_2012;
		}



		public double getData_2013() {
			return data_2013;
		}



		public void setData_2013(double data_2013) {
			this.data_2013 = data_2013;
		}


}
