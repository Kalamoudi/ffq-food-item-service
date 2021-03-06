package edu.fiu.ffqr.models;

import java.util.ArrayList;

public class ValidNutrientList {
	final static int validNutrientsSize = 200;
	//Changed nutientList to be in accordance with the new database given by PO
	//It might be displayed weird but that's only because
	//We haven't added the new Database yet into the project

	public static String[] validNutrients = {
			"Total Grams",
			"Energy (kcal)",
			"Total Fat (g)",
			"Total Carbohydrate (g)",
			"Total Protein (g)",
			"Animal Protein (g)",
			"Vegetable Protein (g)",
			"Alcohol (g)",
			"Cholesterol (mg)",
			"Total Saturated Fatty Acids (SFA) (g)",
			"Total Monounsaturated Fatty Acids (MUFA) (g)",
			"Total Polyunsaturated Fatty Acids (PUFA) (g)",
			"Fructose (g)",
			"Galactose (g)",
			"Glucose (g)",
			"Lactose (g)",
			"Maltose (g)",
			"Sucrose (g)",
			"Starch (g)",
			"Total Dietary Fiber (g)",
			"Soluble Dietary Fiber (g)",
			"Insoluble Dietary Fiber (g)",
			"Pectins (g)",
			"Total Vitamin A Activity (International Units) (IU)",
			"Beta-Carotene Equivalents (derived from provitamin A carotenoids) (mcg)",
			"Retinol (mcg)",
			"Vitamin D (calciferol) (mcg)",
			"Total Alpha-Tocopherol Equivalents (mg)",
			"Vitamin E (Total Alpha-Tocopherol) (mg)",
			"Beta-Tocopherol (mg)",
			"Gamma-Tocopherol (mg)",
			"Delta-Tocopherol (mg)",
			"Vitamin K (phylloquinone) (mcg)",
			"Vitamin C (ascorbic acid) (mg)",
			"Thiamin (vitamin B1) (mg)",
			"Riboflavin (vitamin B2) (mg)",
			"Niacin (vitamin B3) (mg)",
			"Pantothenic Acid (mg)",
			"Vitamin B-6 (pyridoxine, pyridoxyl, & pyridoxamine) (mg)",
			"Total Folate (mcg)",
			"Vitamin B-12 (cobalamin) (mcg)",
			"Calcium (mg)",
			"Phosphorus (mg)",
			"Magnesium (mg)",
			"Iron (mg)",
			"Zinc (mg)",
			"Copper (mg)",
			"Selenium (mcg)",
			"Sodium (mg)",
			"Potassium (mg)",
			"Tryptophan (g)",
			"Threonine (g)",
			"Isoleucine (g)",
			"Leucine (g)",
			"Lysine (g)",
			"Methionine (g)",
			"Cystine (g)",
			"Phenylalanine (g)",
			"Tyrosine (g)",
			"Valine (g)",
			"Arginine (g)",
			"Histidine (g)",
			"Alanine (g)",
			"Aspartic Acid (g)",
			"Glutamic Acid (g)",
			"Glycine (g)",
			"Proline (g)",
			"Serine (g)",
			"Aspartame (mg)",
			"Saccharin (mg)",
			"Caffeine (mg)",
			"Phytic Acid (mg)",
			"Oxalic Acid (mg)",
			"3-Methylhistidine (mg)",
			"Sucrose Polyester (g)",
			"Ash (g)",
			"Water (g)",
			"Total Vitamin A Activity (Retinol Equivalents) (mcg)",
			"Total Trans-Fatty Acids (TRANS) (g)",
			"Beta-Carotene (provitamin A carotenoid) (mcg)",
			"Alpha-Carotene (provitamin A carotenoid) (mcg)",
			"Beta-Cryptoxanthin (provitamin A carotenoid) (mcg)",
			"Lutein + Zeaxanthin (mcg)",
			"Lycopene (mcg)",
			"Dietary Folate Equivalents (mcg)",
			"Natural Folate (food folate) (mcg)",
			"Synthetic Folate (folic acid) (mcg)",
			"Total Vitamin A Activity (Retinol Activity Equivalents) (mcg)",
			"Energy (kj)",
			"Niacin Equivalents (mg)",
			"Total Sugars (g)",
			"Omega-3 Fatty Acids (g)",
			"Manganese (mg)",
			"Vitamin E (International Units) (IU)",
			"Natural Alpha-Tocopherol (RRR-alpha-tocopherol or d-alpha-tocopherol) (mg)",
			"Synthetic Alpha-Tocopherol (all rac-alpha-tocopherol or dl-alpha-tocopherol) (mg)",
			"Daidzein (mg)",
			"Genistein (mg)",
			"Glycitein (mg)",
			"Coumestrol (mg)",
			"Biochanin A (mg)",
			"Formononetin (mg)",
			"Added Sugars (by Available Carbohydrate) (g)",
			"Acesulfame Potassium (mg)",
			"Sucralose (mg)",
			"Available Carbohydrate (g)",
			"Choline (mg)",
			"Betaine (mg)",
			"Erythritol (g)",
			"Inositol (g)",
			"Isomalt (g)",
			"Lactitol (g)",
			"Maltitol (g)",
			"Mannitol (g)",
			"Pinitol (g)",
			"Sorbitol (g)",
			"Xylitol (g)",
			"Nitrogen (g)",
			"Tagatose (mg)",
			"Vitamin D2 (ergocalciferol) (mcg)",
			"Vitamin D3 (cholecalciferol) (mcg)",
			"Added Sugars (by Total Sugars) (g)",
			"Total Grains (ounce equivalents)",
			"Whole Grains (ounce equivalents)",
			"Refined Grains (ounce equivalents)",
			"PUFA 18:3 n-3 (alpha-linolenic acid [ALA]) (g)",
			"Solid Fats (g)", 
			"CLA cis-9, trans-11 (g)" // added manually
		};

/*
		public static String[] validNutrients = {
			"Total Grams",
			"Total oz",
			"Energy (kcal)",
			"Total Fat (g)", 
			"Total Carbohydrate (g)", 
			"Total Protein (g)", 
			"Animal Protein (g)", 
			"Vegetable Protein (g)", 
			"Alcohol (g)", 
			"Cholesterol (mg)", 
			"Total Saturated Fatty Acids (SFA) (g)", 
			"Total Monounsaturated Fatty Acids (MUFA) (g)", 
			"Total Polyunsaturated Fatty Acids (PUFA) (g)", 
			"Fructose (g)", 
			"Galactose (g)", 
			"Glucose (g)", 
			"Lactose (g)", 
			"Maltose (g)", 
			"Sucrose (g)", 
			"Starch (g)", 
			"Total Dietary Fiber (g)", 
			"Soluble Dietary Fiber (g)", 
			"Insoluble Dietary Fiber (g)", "Pectins (g)", "Total Vitamin A Activity (International Units) (IU)", "Beta-Carotene Equivalents (derived from provitamin A carotenoids) (mcg)", "Retinol (mcg)", "Vitamin D (calciferol) (mcg)", "Total Alpha-Tocopherol Equivalents (mg)", "Vitamin E (Total Alpha-Tocopherol) (mg)", "Beta-Tocopherol (mg)", "Gamma-Tocopherol (mg)", "Delta-Tocopherol (mg)", "Vitamin K (phylloquinone) (mcg)", "Vitamin C (ascorbic acid) (mg)", "Thiamin (vitamin B1) (mg)", "Riboflavin (vitamin B2) (mg)", "Niacin (vitamin B3) (mg)", "Pantothenic Acid (mg)", "Vitamin B-6 (pyridoxine, pyridoxyl, & pyridoxamine) (mg)", "Total Folate (mcg)", "Vitamin B-12 (cobalamin) (mcg)", "Calcium (mg)", "Phosphorus (mg)", "Magnesium (mg)", "Iron (mg)", "Zinc (mg)", "Copper (mg)", "Selenium (mcg)", "Sodium (mg)", "Potassium (mg)", "SFA 4:0 (butyric acid) (g)", "SFA 6:0 (caproic acid) (g)", "SFA 8:0 (caprylic acid) (g)", "SFA 10:0 (capric acid) (g)", "SFA 12:0 (lauric acid) (g)", "SFA 14:0 (myristic acid) (g)", "SFA 16:0 (palmitic acid) (g)", "SFA 17:0 (margaric acid) (g)", "SFA 18:0 (stearic acid) (g)", "SFA 20:0 (arachidic acid) (g)", "SFA 22:0 (behenic acid) (g)", "MUFA 14:1 (myristoleic acid) (g)", "MUFA 16:1 (palmitoleic acid) (g)", "MUFA 18:1 (oleic acid) (g)", "MUFA 20:1 (gadoleic acid) (g)", "MUFA 22:1 (erucic acid) (g)", "PUFA 18:2 (linoleic acid) (g)", "PUFA 18:3 (linolenic acid) (g)", "PUFA 18:4 (parinaric acid) (g)", "PUFA 20:4 (arachidonic acid) (g)", "PUFA 20:5 (eicosapentaenoic acid [EPA]) (g)", "PUFA 22:5 (docosapentaenoic acid [DPA]) (g)", "PUFA 22:6 (docosahexaenoic acid [DHA]) (g)", "Tryptophan (g)", "Threonine (g)", "Isoleucine (g)", "Leucine (g)", "Lysine (g)", "Methionine (g)", "Cystine (g)", "Phenylalanine (g)", "Tyrosine (g)", "Valine (g)", "Arginine (g)", "Histidine (g)", "Alanine (g)", "Aspartic Acid (g)", "Glutamic Acid (g)", "Glycine (g)", "Proline (g)", "Serine (g)", "Aspartame (mg)", "Saccharin (mg)", "Caffeine (mg)", "Phytic Acid (mg)", "Oxalic Acid (mg)", "3-Methylhistidine (mg)", "Sucrose Polyester (g)", "Ash (g)", "Water (g)", "% Calories from Fat", "% Calories from Carbohydrate", "% Calories from Protein", "% Calories from Alcohol", "% Calories from SFA", "% Calories from MUFA", "% Calories from PUFA", "Polyunsaturated to Saturated Fat Ratio", "Cholesterol to Saturated Fatty Acid Index", "Total Vitamin A Activity (Retinol Equivalents) (mcg)", "TRANS 18:1 (trans-octadecenoic acid) (g)", "TRANS 18:2 (trans-octadecadienoic acid) (g)", "TRANS 16:1 (trans-hexadecenoic acid) (g)", "Total Trans-Fatty Acids (TRANS) (g)", "User Nutrient 1 (mg)", "User Nutrient 2 (mg)", "User Nutrient 3 (mg)", "User Nutrient 4 (mg)", "User Nutrient 5 (mg)", "User Nutrient 6 (mg)", "User Nutrient 7 (mg)", "User Nutrient 8 (mg)", "User Nutrient 9 (mg)", "User Nutrient 10 (mg)", "Header Notes", "Beta-Carotene (provitamin A carotenoid) (mcg)", "Alpha-Carotene (provitamin A carotenoid) (mcg)", "Beta-Cryptoxanthin (provitamin A carotenoid) (mcg)", "Lutein + Zeaxanthin (mcg)", "Lycopene (mcg)", "Dietary Folate Equivalents (mcg)", "Natural Folate (food folate) (mcg)", "Synthetic Folate (folic acid) (mcg)", "Data Generated in NCC Database Version", "Data Generated in Software Version", "Trailer Notes", "User Nutrient 11 (mg)", "User Nutrient 12 (mg)", "User Nutrient 13 (mg)", "User Nutrient 14 (mg)", "User Nutrient 15 (mg)", "User Nutrient 16 (mg)", "User Nutrient 17 (mg)", "User Nutrient 18 (mg)", "User Nutrient 19 (mg)", "User Nutrient 20 (mg)", "Total Vitamin A Activity (Retinol Activity Equivalents) (mcg)", "Energy (kj)", "Niacin Equivalents (mg)", "Total Sugars (g)", "Omega-3 Fatty Acids (g)", "Manganese (mg)", "Vitamin E (International Units) (IU)", "Natural Alpha-Tocopherol (RRR-alpha-tocopherol or d-alpha-tocopherol) (mg)", "Synthetic Alpha-Tocopherol (all rac-alpha-tocopherol or dl-alpha-tocopherol) (mg)", "Daidzein (mg)", "Genistein (mg)", "Glycitein (mg)", "Coumestrol (mg)", "Biochanin A (mg)", "Formononetin (mg)", "Column intentionally left blank", "Column intentionally left blank", "Column intentionally left blank", "Column intentionally left blank", "Added Sugars (by Available Carbohydrate) (g)", "Acesulfame Potassium (mg)", "Sucralose (mg)", "Available Carbohydrate (g)", "Glycemic Index (glucose reference)", "Glycemic Index (bread reference)", "Glycemic Load (glucose reference)", "Glycemic Load (bread reference)", "Choline (mg)", "Betaine (mg)", "Erythritol (g)", "Inositol (g)", "Isomalt (g)", "Lactitol (g)", "Maltitol (g)", "Mannitol (g)", "Pinitol (g)", "Sorbitol (g)", "Xylitol (g)", "Nitrogen (g)", "Total Conjugated Linoleic Acid (CLA 18:2) (g)", "CLA cis-9, trans-11 (g)", "CLA trans-10, cis-12 (g)", "Tagatose (mg)", "Vitamin D2 (ergocalciferol) (mcg)", "Vitamin D3 (cholecalciferol) (mcg)", "Added Sugars (by Total Sugars) (g)", "Total Grains (ounce equivalents)", "Whole Grains (ounce equivalents)", "Refined Grains (ounce equivalents)", "PUFA 18:3 n-3 (alpha-linolenic acid [ALA]) (g)", "Solid Fats (g)"
		
		};*/
}
