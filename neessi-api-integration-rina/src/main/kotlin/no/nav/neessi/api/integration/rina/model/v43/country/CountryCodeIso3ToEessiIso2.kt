package no.nav.neessi.api.integration.rina.model.v43.country

fun iso3ToEessiIso2(iso3: String) =
    when (iso3) {
        "AND" -> "AD"
        "ARE" -> "AE"
        "AFG" -> "AF"
        "ATG" -> "AG"
        "AIA" -> "AI"
        "AFI" -> "AIDJ"
        "ALB" -> "AL"
        "ARM" -> "AM"
        "ANT" -> "ANHH"
        "AGO" -> "AO"
        "ATA" -> "AQ"
        "ARG" -> "AR"
        "ASM" -> "AS"
        "AUT" -> "AT"
        "AUS" -> "AU"
        "ABW" -> "AW"
        "ALA" -> "AX"
        "AZE" -> "AZ"
        "BIH" -> "BA"
        "BRB" -> "BB"
        "BGD" -> "BD"
        "BEL" -> "BE"
        "BFA" -> "BF"
        "BGR" -> "BG"
        "BHR" -> "BH"
        "BDI" -> "BI"
        "BEN" -> "BJ"
        "BLM" -> "BL"
        "BMU" -> "BM"
        "BRN" -> "BN"
        "BOL" -> "BO"
        "BES" -> "BQ"
        "ATB" -> "BQAQ"
        "BRA" -> "BR"
        "BHS" -> "BS"
        "BTN" -> "BT"
        "BUR" -> "BUMM"
        "BVT" -> "BV"
        "BWA" -> "BW"
        "BLR" -> "BY"
        "BYS" -> "BYAA"
        "BLZ" -> "BZ"
        "CAN" -> "CA"
        "CCK" -> "CC"
        "COD" -> "CD"
        "CAF" -> "CF"
        "COG" -> "CG"
        "CHE" -> "CH"
        "CIV" -> "CI"
        "COK" -> "CK"
        "CHL" -> "CL"
        "CMR" -> "CM"
        "CHN" -> "CN"
        "COL" -> "CO"
        "CRI" -> "CR"
        "CSK" -> "CSHH"
        "SCG" -> "CSXX"
        "CTE" -> "CTKI"
        "CUB" -> "CU"
        "CPV" -> "CV"
        "CUW" -> "CW"
        "CXR" -> "CX"
        "CYP" -> "CY"
        "CZE" -> "CZ"
        "DDR" -> "DDDE"
        "DEU" -> "DE"
        "DJI" -> "DJ"
        "DNK" -> "DK"
        "DMA" -> "DM"
        "DOM" -> "DO"
        "DHY" -> "DYBJ"
        "DZA" -> "DZ"
        "ECU" -> "EC"
        "EST" -> "EE"
        "EGY" -> "EG"
        "ESH" -> "EH"
        "ERI" -> "ER"
        "ESP" -> "ES"
        "ETH" -> "ET"
        "FIN" -> "FI"
        "FJI" -> "FJ"
        "FLK" -> "FK"
        "FSM" -> "FM"
        "FRO" -> "FO"
        "ATF" -> "FQHH"
        "FRA" -> "FR"
        "FXX" -> "FXFR"
        "GAB" -> "GA"
        "GBR" -> "GB"
        "GRD" -> "GD"
        "GEO" -> "GE"
        "GEL" -> "GEHH"
        "GUF" -> "GF"
        "GGY" -> "GG"
        "GHA" -> "GH"
        "GIB" -> "GI"
        "GRL" -> "GL"
        "GMB" -> "GM"
        "GIN" -> "GN"
        "GLP" -> "GP"
        "GNQ" -> "GQ"
        "GRC" -> "GR"
        "SGS" -> "GS"
        "GTM" -> "GT"
        "GUM" -> "GU"
        "GNB" -> "GW"
        "GUY" -> "GY"
        "HKG" -> "HK"
        "HMD" -> "HM"
        "HND" -> "HN"
        "HRV" -> "HR"
        "HTI" -> "HT"
        "HUN" -> "HU"
        "HVO" -> "HVBF"
        "IDN" -> "ID"
        "IRL" -> "IE"
        "ISR" -> "IL"
        "IMN" -> "IM"
        "IND" -> "IN"
        "IOT" -> "IO"
        "IRQ" -> "IQ"
        "IRN" -> "IR"
        "ISL" -> "IS"
        "ITA" -> "IT"
        "JEY" -> "JE"
        "JAM" -> "JM"
        "JOR" -> "JO"
        "JPN" -> "JP"
        "JTN" -> "JTUM"
        "KEN" -> "KE"
        "KGZ" -> "KG"
        "KHM" -> "KH"
        "KIR" -> "KI"
        "COM" -> "KM"
        "KNA" -> "KN"
        "PRK" -> "KP"
        "KOR" -> "KR"
        "KWT" -> "KW"
        "CYM" -> "KY"
        "KAZ" -> "KZ"
        "LAO" -> "LA"
        "LBN" -> "LB"
        "LCA" -> "LC"
        "LIE" -> "LI"
        "LKA" -> "LK"
        "LBR" -> "LR"
        "LSO" -> "LS"
        "LTU" -> "LT"
        "LUX" -> "LU"
        "LVA" -> "LV"
        "LBY" -> "LY"
        "MAR" -> "MA"
        "MCO" -> "MC"
        "MDA" -> "MD"
        "MNE" -> "ME"
        "MAF" -> "MF"
        "MDG" -> "MG"
        "MHL" -> "MH"
        "MID" -> "MIUM"
        "MKD" -> "MK"
        "MLI" -> "ML"
        "MMR" -> "MM"
        "MNG" -> "MN"
        "MAC" -> "MO"
        "MNP" -> "MP"
        "MTQ" -> "MQ"
        "MRT" -> "MR"
        "MSR" -> "MS"
        "MLT" -> "MT"
        "MUS" -> "MU"
        "MDV" -> "MV"
        "MWI" -> "MW"
        "MEX" -> "MX"
        "MYS" -> "MY"
        "MOZ" -> "MZ"
        "NAM" -> "NA"
        "NCL" -> "NC"
        "NER" -> "NE"
        "NFK" -> "NF"
        "NGA" -> "NG"
        "NHB" -> "NHVU"
        "NIC" -> "NI"
        "NLD" -> "NL"
        "NOR" -> "NO"
        "NPL" -> "NP"
        "ATN" -> "NQAQ"
        "NRU" -> "NR"
        "NTZ" -> "NTHH"
        "NIU" -> "NU"
        "NZL" -> "NZ"
        "OMN" -> "OM"
        "PAN" -> "PA"
        "PCI" -> "PCHH"
        "PER" -> "PE"
        "PYF" -> "PF"
        "PNG" -> "PG"
        "PHL" -> "PH"
        "PAK" -> "PK"
        "POL" -> "PL"
        "SPM" -> "PM"
        "PCN" -> "PN"
        "PRI" -> "PR"
        "PSE" -> "PS"
        "PRT" -> "PT"
        "PUS" -> "PUUM"
        "PLW" -> "PW"
        "PRY" -> "PY"
        "PCZ" -> "PZPA"
        "QAT" -> "QA"
        "REU" -> "RE"
        "RHO" -> "RHZW"
        "ROU" -> "RO"
        "SRB" -> "RS"
        "RUS" -> "RU"
        "RWA" -> "RW"
        "SAU" -> "SA"
        "SLB" -> "SB"
        "SYC" -> "SC"
        "SDN" -> "SD"
        "SWE" -> "SE"
        "SGP" -> "SG"
        "SHN" -> "SH"
        "SVN" -> "SI"
        "SJM" -> "SJ"
        "SVK" -> "SK"
        "SKM" -> "SKIN"
        "SLE" -> "SL"
        "SMR" -> "SM"
        "SEN" -> "SN"
        "SOM" -> "SO"
        "SUR" -> "SR"
        "SSD" -> "SS"
        "STP" -> "ST"
        "SUN" -> "SUHH"
        "SLV" -> "SV"
        "SXM" -> "SX"
        "SYR" -> "SY"
        "SWZ" -> "SZ"
        "TCA" -> "TC"
        "TCD" -> "TD"
        "TGO" -> "TG"
        "THA" -> "TH"
        "TJK" -> "TJ"
        "TKL" -> "TK"
        "TMP" -> "TL"
        "TKM" -> "TM"
        "TUN" -> "TN"
        "TON" -> "TO"
        "TLS" -> "TPTL"
        "TUR" -> "TR"
        "TTO" -> "TT"
        "TUV" -> "TV"
        "TWN" -> "TW"
        "TZA" -> "TZ"
        "UKR" -> "UA"
        "UGA" -> "UG"
        "UMI" -> "UM"
        "USA" -> "US"
        "URY" -> "UY"
        "UZB" -> "UZ"
        "VAT" -> "VA"
        "VCT" -> "VC"
        "VDR" -> "VDVN"
        "VEN" -> "VE"
        "VGB" -> "VG"
        "VIR" -> "VI"
        "VNM" -> "VN"
        "VUT" -> "VU"
        "WLF" -> "WF"
        "WAK" -> "WKUM"
        "WSM" -> "WS"
        "XXK" -> "XK"
        "YMD" -> "YDYE"
        "YEM" -> "YE"
        "MYT" -> "YT"
        "YUG" -> "YUCS"
        "ZAF" -> "ZA"
        "ZMB" -> "ZM"
        "ZAR" -> "ZRCD"
        "ZWE" -> "ZW"
        "XXR" -> "XR"
        "XXS" -> "XS"
        "XXU" -> "XU"
        else -> throw IllegalArgumentException("No mapping for country code $iso3")
    }
