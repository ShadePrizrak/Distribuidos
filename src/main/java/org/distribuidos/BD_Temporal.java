package org.distribuidos;
public class BD_Temporal {
        
        
        public Carga_Data[] DevolverData(String Opcion) {
			Carga_Data[] Data=new Carga_Data[10];
        	switch(Opcion){
        	case "1":
        		Data[0] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Argentina","ARG",8500,8800, 91000, 9300, 9600, 9900,
        				 10000, 10000, 11000);
        				Data[1] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Brazil","BRA",48000,51000, 54000, 57000, 60000, 63000,
        				 66000, 69000, 72000);
        				Data[2] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Colombia","COL",110000,110000, 110000, 110000, 110000,110000,
        				 110000, 110000, 120000);
        				Data[3] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Chile","CHL",28000,30000,33000, 35000, 38000, 41000,
        				 44000, 47000, 50000);
        				Data[4] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Bolivia","BOL",17000,18000, 18000, 19000, 19000, 18000,
        				 18000, 18000, 18000);
        				Data[5] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Ecuador","ECU",22000,22000, 23000, 23000, 24000, 25000,
        				 26000, 28000, 29000);
        				Data[6] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Peru","PER",70000,69000, 68000, 66000, 66000, 66000,
        				 67000, 67000, 68000);
        				Data[7] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Paraguay","PRY",11000,12000, 13000, 14000, 14000, 15000,
        				 16000, 16000, 17000);
        				Data[8] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Uruguay","URY",11000,11000, 12000, 12000, 12000, 12000,
        				 11000, 11000, 11000);
        				Data[9] = new Carga_Data("Adults (ages 15+) living with HIV",
        				"SH.DYN.AIDS","Venezuela, RB","VEN",71000,76000, 81000, 85000, 90000, 95000,
        				 99000, 100000, 110000);       		
        		break;
        	case "2":
        		Data[0] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Argentina","ARG",0,0,0,0,0,26.6,0,0,0);
        				Data[1] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Brazil","BRA",0,0,0,0,0,31.9,0,0,0);
        				Data[2] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Colombia","COL",26.9,26.5,0,0,0,26.8,0,0,0);
        				Data[3] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Chile","CHL",0,28.9,0,0,0,0,29.3,0,0);
        				Data[4] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Bolivia","BOL",0,0,0,25.3,0,0,0,26.6,0);
        				Data[5] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Ecuador","ECU",0,0,0,0,0,25,0,0,0);
        				Data[6] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Peru","PER",28.2,0,26.6,28.2,27.5,27.8,27.8,28,27.5);
        				Data[7] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Paraguay","PRY",0,0,0,0,0,0,0,0,0);
        				Data[8] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Uruguay","URY",0,0,0,0,0,0,26.5,0,0);
        				Data[9] = new Carga_Data("Age at first marriage, male",
        				"SP.DYN.SMAM.MA","Venezuela, RE","VEN",0,0,0,0,0,0,0,0,0);
        		break;
        	case "3":
        		Data[0] = new Carga_Data("Age at first marriage, female",
        				"SP.DYN.SMAM.FE","Argentina","ARG",0,0,0,0,0,24.6,0,0,0);
        				Data[1] = new Carga_Data("Age at first marriage, female",
        				"SP.DYN.SMAM.FE","Brazil","BRA",0,0,0,0,0,29.7,0,0,0);
        				Data[2] = new Carga_Data("Age at first marriage, female",
        				"SP.DYN.SMAM.FE","Colombia","COL",23,23.1,0,0,0,22.3,0,0,0);
        				Data[3] = new Carga_Data("Age at first marriage, female",
        				"SP.DYN.SMAM.FE","Chile","CHL",0,26.1,0,0,0,0,27.4,0,0);
        				Data[4] = new Carga_Data("Age at first marriage, female",
        				"SP.DYN.SMAM.FE","Bolivia","BOL",0,0,0,22.7,0,0,0,24.1,0);
        				Data[5] = new Carga_Data("Age at first marriage, efmale",
        				"SP.DYN.SMAM.FE","Ecuador","ECU",0,0,0,0,0,21.8,0,0,0);
        				Data[6] = new Carga_Data("Age at first marriage, female",
        				"SP.DYN.SMAM.FE","Peru","PER",24.4,0,23.5,24.1,23.2,23.1,23.6,23.5,0);
        				Data[7] = new Carga_Data("Age at first marriage, female",
        				"SP.DYN.SMAM.FE","Paraguay","PRY",0,0,0,0,0,0,0,0,0);
        				Data[8] = new Carga_Data("Age at first marriage, female",
        				"SP.DYN.SMAM.FE","Uruguay","URY",0,0,0,0,0,0,24,0,0);
        				Data[9] = new Carga_Data("Age at first marriage, female",
        				"SP.DYN.SMAM.FE","Venezuela, RE","VEN",0,0,0,0,0,0,0,0,0);
        		break;
        	case "4":
        		Data[0] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Argentina","ARG",0,0,0,0,0,0,0,0,0);
        				Data[1] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Brazil","BRA",0,0,0,0,0,0,0,0,0);
        				Data[2] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Colombia","COL",0,0,0,0,0,0,0,0,0);
        				Data[3] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Chile","CHL",0,0,0,0,0,0,0,0,0);
        				Data[4] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Bolivia","BOL",0,0,0,0,0,0,0,0,0);
        				Data[5] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Ecuador","ECU",0,0,0,0,0,0,0,0,0);
        				Data[6] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Peru","PER",0,0,0,0,0,0,0,0,0);
        				Data[7] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Paraguay","PRY",0,0,0,0,0,0,0,0,0);
        				Data[8] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Uruguay","URY",0,0,0,0,0,0,0,0,0);
        				Data[9] = new Carga_Data("Diabetes prevalence (% of population ages 20 to 79)",
        				"SH.STA.DIAB.ZS","Venezuela, RE","VEN",0,0,0,0,0,0,0,0,0);
        		break;
        	case "5":
        		Data[0] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Argentina","ARG",4,0,0,0,0,4.5,4.5,4.7,0);
        				Data[1] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Brazil","BRA",2.4,0,0,0,0,2.4,2.4,2.3,2.3);
        				Data[2] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Colombia","COL",0,1,1,0,0,0,0,1.4,1.5);
        				Data[3] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Chile","CHL",2.3,2.3,0,0,0,2.1,2.1,2.1,0);
        				Data[4] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Bolivia","BOL",0,1.1,1.1,1.1,1.1,0,1.1,1.1,0);
        				Data[5] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Ecuador","ECU",0,0,0,0,1.5,1.5,1.6,1.6,0);
        				Data[6] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Peru","PER",0,0,1.2,1.5,1.5,1.5,1.5,1.5,0);
        				Data[7] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Paraguay","PRY",1.2,1.3,1.3,1.3,1.3,1.3,1.3,1.3,0);
        				Data[8] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Uruguay","URY",2.4,2.9,2.9,0,0,1.2,3,2.5,0);
        				Data[9] = new Carga_Data("Hospital beds (per 1,000 people)",
        				"SH.MED.BEDS.ZS","Venezuela, RE","VEN",0,0,1.3,0,1.1,0,0.9,0,0);
        		break;
        	case "6":
        		Data[0] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Argentina","ARG",31,28,29,26,22,20,27,24,24);
        				Data[1] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Brazil","BRA",50,46,45,46,45,44,44,42,45);
        				Data[2] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Colombia","COL",30,32,31,32,31,31,32,32,31);
        				Data[3] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Chile","CHL",18,18,17,17,16,16,16,16,16);
        				Data[4] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Bolivia","BOL",158,153,148,144,139,135,131,127,123);
        				Data[5] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Ecuador","ECU",70,67,63,61,60,59,59,59,56);
        				Data[6] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Peru","PER",153,153,143,140,137,132,131,123,122);
        				Data[7] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Paraguay","PRY",43,48,44,42,44,42,43,44,40);
        				Data[8] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Uruguay","URY",22,19,21,24,24,24,28,27,30);
        				Data[9] = new Carga_Data("Incidence of tuberculosis (per 100,000 people)",
        				"SH.TBS.INCD","Venezuela, RE","VEN",32,31,29,28,28,28,27,27,27);
        		break;
        	case "7":
        		Data[0] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Argentina","ARG",74.78,74.941,75.105,75.268,75.431,75.595,75.761,75.926,76.089);
        				Data[1] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Brazil","BRA",72.04,72.405,72.768,73.129,73.488,73.838,74.174,74.488,74.777);
        				Data[2] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Colombia","COL",72.3,72.532,72.749,72.952,73.143,73.325,73.5,73.673,73.847);
        				Data[3] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Chile","CHL",77.79,77.934,78.066,78.193,78.32,78.454,78.599,78.758,78.931);
        				Data[4] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Bolivia","BOL",63.54,64.113,64.692,65.272,65.847,66.408,66.945,67.451,67.922);
        				Data[5] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Ecuador","ECU",74.14,74.322,74.501,74.678,74.859,75.046,75.244,75.449,75.661);
        				Data[6] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Peru","PER",72.47,72.764,73.023,73.258,73.475,73.681,73.883,74.088,74.298);
        				Data[7] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Paraguay","PRY",71.28,71.485,71.686,71.887,72.089,72.285,72.47,72.638,72.786);
        				Data[8] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Uruguay","URY",75.79,75.961,76.124,76.282,76.436,76.588,76.739,76.89,77.04);
        				Data[9] = new Carga_Data("Life expectancy at birth, total (years)",
        				"SH.STA.DIAB.ZS","Venezuela, RE","VEN",73.13,73.235,73.327,73.419,73.516,73.625,73.748,73.885,74.035);
        		break;
        	}
  	
        	return Data;
        	
        } 
    
}