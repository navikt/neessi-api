package no.nav.neessi.api.integration.rina.model.v43.country

/*
    Egen funksjon for mapping er ryddig og enkelt, nå CDM versjonert etter diskusjoner med Arild
    hva tenker vi?
 */

fun eessiIso2ToIso3(eessiIso2: String) =
    when (eessiIso2) {
        "AD" -> "AND"
        "AE" -> "ARE"
        "AF" -> "AFG"
        "AG" -> "ATG"
        "AI" -> "AIA"
        "AIDJ" -> "AFI"
        "AL" -> "ALB"
        "AM" -> "ARM"
        "ANHH" -> "ANT"
        "AO" -> "AGO"
        "AQ" -> "ATA"
        "AR" -> "ARG"
        "AS" -> "ASM"
        "AT" -> "AUT"
        "AU" -> "AUS"
        "AW" -> "ABW"
        "AX" -> "ALA"
        "AZ" -> "AZE"
        "BA" -> "BIH"
        "BB" -> "BRB"
        "BD" -> "BGD"
        "BE" -> "BEL"
        "BF" -> "BFA"
        "BG" -> "BGR"
        "BH" -> "BHR"
        "BI" -> "BDI"
        "BJ" -> "BEN"
        "BL" -> "BLM"
        "BM" -> "BMU"
        "BN" -> "BRN"
        "BO" -> "BOL"
        "BQ" -> "BES"
        "BQAQ" -> "ATB"
        "BR" -> "BRA"
        "BS" -> "BHS"
        "BT" -> "BTN"
        "BUMM" -> "BUR"
        "BV" -> "BVT"
        "BW" -> "BWA"
        "BY" -> "BLR"
        "BYAA" -> "BYS"
        "BZ" -> "BLZ"
        "CA" -> "CAN"
        "CC" -> "CCK"
        "CD" -> "COD"
        "CF" -> "CAF"
        "CG" -> "COG"
        "CH" -> "CHE"
        "CI" -> "CIV"
        "CK" -> "COK"
        "CL" -> "CHL"
        "CM" -> "CMR"
        "CN" -> "CHN"
        "CO" -> "COL"
        "CR" -> "CRI"
        "CSHH" -> "CSK"
        "CSXX" -> "SCG"
        "CTKI" -> "CTE"
        "CU" -> "CUB"
        "CV" -> "CPV"
        "CW" -> "CUW"
        "CX" -> "CXR"
        "CY" -> "CYP"
        "CZ" -> "CZE"
        "DDDE" -> "DDR"
        "DE" -> "DEU"
        "DJ" -> "DJI"
        "DK" -> "DNK"
        "DM" -> "DMA"
        "DO" -> "DOM"
        "DYBJ" -> "DHY"
        "DZ" -> "DZA"
        "EC" -> "ECU"
        "EE" -> "EST"
        "EG" -> "EGY"
        "EH" -> "ESH"
        "ER" -> "ERI"
        "ES" -> "ESP"
        "ET" -> "ETH"
        "FI" -> "FIN"
        "FJ" -> "FJI"
        "FK" -> "FLK"
        "FM" -> "FSM"
        "FO" -> "FRO"
        "FQHH" -> "ATF"
        "FR" -> "FRA"
        "FXFR" -> "FXX"
        "GA" -> "GAB"
        "GB" -> "GBR"
        "GD" -> "GRD"
        "GE" -> "GEO"
        "GEHH" -> "GEL"
        "GF" -> "GUF"
        "GG" -> "GGY"
        "GH" -> "GHA"
        "GI" -> "GIB"
        "GL" -> "GRL"
        "GM" -> "GMB"
        "GN" -> "GIN"
        "GP" -> "GLP"
        "GQ" -> "GNQ"
        "GR" -> "GRC"
        "GS" -> "SGS"
        "GT" -> "GTM"
        "GU" -> "GUM"
        "GW" -> "GNB"
        "GY" -> "GUY"
        "HK" -> "HKG"
        "HM" -> "HMD"
        "HN" -> "HND"
        "HR" -> "HRV"
        "HT" -> "HTI"
        "HU" -> "HUN"
        "HVBF" -> "HVO"
        "ID" -> "IDN"
        "IE" -> "IRL"
        "IL" -> "ISR"
        "IM" -> "IMN"
        "IN" -> "IND"
        "IO" -> "IOT"
        "IQ" -> "IRQ"
        "IR" -> "IRN"
        "IS" -> "ISL"
        "IT" -> "ITA"
        "JE" -> "JEY"
        "JM" -> "JAM"
        "JO" -> "JOR"
        "JP" -> "JPN"
        "JTUM" -> "JTN"
        "KE" -> "KEN"
        "KG" -> "KGZ"
        "KH" -> "KHM"
        "KI" -> "KIR"
        "KM" -> "COM"
        "KN" -> "KNA"
        "KP" -> "PRK"
        "KR" -> "KOR"
        "KW" -> "KWT"
        "KY" -> "CYM"
        "KZ" -> "KAZ"
        "LA" -> "LAO"
        "LB" -> "LBN"
        "LC" -> "LCA"
        "LI" -> "LIE"
        "LK" -> "LKA"
        "LR" -> "LBR"
        "LS" -> "LSO"
        "LT" -> "LTU"
        "LU" -> "LUX"
        "LV" -> "LVA"
        "LY" -> "LBY"
        "MA" -> "MAR"
        "MC" -> "MCO"
        "MD" -> "MDA"
        "ME" -> "MNE"
        "MF" -> "MAF"
        "MG" -> "MDG"
        "MH" -> "MHL"
        "MIUM" -> "MID"
        "MK" -> "MKD"
        "ML" -> "MLI"
        "MM" -> "MMR"
        "MN" -> "MNG"
        "MO" -> "MAC"
        "MP" -> "MNP"
        "MQ" -> "MTQ"
        "MR" -> "MRT"
        "MS" -> "MSR"
        "MT" -> "MLT"
        "MU" -> "MUS"
        "MV" -> "MDV"
        "MW" -> "MWI"
        "MX" -> "MEX"
        "MY" -> "MYS"
        "MZ" -> "MOZ"
        "NA" -> "NAM"
        "NC" -> "NCL"
        "NE" -> "NER"
        "NF" -> "NFK"
        "NG" -> "NGA"
        "NHVU" -> "NHB"
        "NI" -> "NIC"
        "NL" -> "NLD"
        "NO" -> "NOR"
        "NP" -> "NPL"
        "NQAQ" -> "ATN"
        "NR" -> "NRU"
        "NTHH" -> "NTZ"
        "NU" -> "NIU"
        "NZ" -> "NZL"
        "OM" -> "OMN"
        "PA" -> "PAN"
        "PCHH" -> "PCI"
        "PE" -> "PER"
        "PF" -> "PYF"
        "PG" -> "PNG"
        "PH" -> "PHL"
        "PK" -> "PAK"
        "PL" -> "POL"
        "PM" -> "SPM"
        "PN" -> "PCN"
        "PR" -> "PRI"
        "PS" -> "PSE"
        "PT" -> "PRT"
        "PUUM" -> "PUS"
        "PW" -> "PLW"
        "PY" -> "PRY"
        "PZPA" -> "PCZ"
        "QA" -> "QAT"
        "RE" -> "REU"
        "RHZW" -> "RHO"
        "RO" -> "ROU"
        "RS" -> "SRB"
        "RU" -> "RUS"
        "RW" -> "RWA"
        "SA" -> "SAU"
        "SB" -> "SLB"
        "SC" -> "SYC"
        "SD" -> "SDN"
        "SE" -> "SWE"
        "SG" -> "SGP"
        "SH" -> "SHN"
        "SI" -> "SVN"
        "SJ" -> "SJM"
        "SK" -> "SVK"
        "SKIN" -> "SKM"
        "SL" -> "SLE"
        "SM" -> "SMR"
        "SN" -> "SEN"
        "SO" -> "SOM"
        "SR" -> "SUR"
        "SS" -> "SSD"
        "ST" -> "STP"
        "SUHH" -> "SUN"
        "SU" -> "SUN"
        "SV" -> "SLV"
        "SX" -> "SXM"
        "SY" -> "SYR"
        "SZ" -> "SWZ"
        "TC" -> "TCA"
        "TD" -> "TCD"
        "TF" -> "ATF"
        "TG" -> "TGO"
        "TH" -> "THA"
        "TJ" -> "TJK"
        "TK" -> "TKL"
        "TL" -> "TMP"
        "TM" -> "TKM"
        "TN" -> "TUN"
        "TO" -> "TON"
        "TPTL" -> "TLS"
        "TR" -> "TUR"
        "TT" -> "TTO"
        "TV" -> "TUV"
        "TW" -> "TWN"
        "TZ" -> "TZA"
        "UA" -> "UKR"
        "UG" -> "UGA"
        "UM" -> "UMI"
        "US" -> "USA"
        "UY" -> "URY"
        "UZ" -> "UZB"
        "VA" -> "VAT"
        "VC" -> "VCT"
        "VDVN" -> "VDR"
        "VE" -> "VEN"
        "VG" -> "VGB"
        "VI" -> "VIR"
        "VN" -> "VNM"
        "VU" -> "VUT"
        "WF" -> "WLF"
        "WKUM" -> "WAK"
        "WS" -> "WSM"
        "XK" -> "XXK"
        "YDYE" -> "YMD"
        "YE" -> "YEM"
        "YT" -> "MYT"
        "YUCS" -> "YUG"
        "YU" -> "YUG"
        "ZA" -> "ZAF"
        "ZM" -> "ZMB"
        "ZRCD" -> "ZAR"
        "ZW" -> "ZWE"
        "XR" -> "XXR"
        "XS" -> "XXS"
        "XU" -> "XXU"
        else -> throw IllegalArgumentException("No mapping for country code $eessiIso2")
    }
