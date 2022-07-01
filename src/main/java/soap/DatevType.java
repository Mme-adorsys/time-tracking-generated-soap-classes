/**
 * DatevType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Datensatz des Buchhaltungs-Exports im DATEV Format
 */
public class DatevType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DatevType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "DatevType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("umsatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "umsatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soll_haben_kz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soll_haben_kz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wkz_umsatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wkz_umsatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basis_umsatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basis_umsatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wkz_basis_umsatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wkz_basis_umsatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("konto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "konto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gegenkonto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gegenkonto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steuerschluessel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "steuerschluessel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegfeld1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegfeld1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegfeld2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegfeld2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skonto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skonto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buchungstext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buchungstext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postensperre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postensperre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diverse_adressNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diverse_adressNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geschaeftspartnerbank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geschaeftspartnerbank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sachverhalt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sachverhalt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zinssperre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zinssperre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleglink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleglink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_art1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_art1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_inhalt1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_inhalt1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_art2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_art2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_inhalt2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_inhalt2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_art3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_art3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_inhalt3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_inhalt3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_art4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_art4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_inhalt4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_inhalt4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_art5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_art5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_inhalt5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_inhalt5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_art6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_art6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_inhalt6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_inhalt6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_art7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_art7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_inhalt7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_inhalt7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_art8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_art8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleginfo_inhalt8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleginfo_inhalt8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kost1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kost1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kost2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kost2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kost_menge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kost_menge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("euLand_UStID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "euLand_UStID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eu_steuersatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eu_steuersatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abw_versteuerungsart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abw_versteuerungsart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sachverhalt_LL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sachverhalt_LL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funktionsergaenzung_LL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funktionsergaenzung_LL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bu49_hauptfunktionstyp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bu49_hauptfunktionstyp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bu49_hauptfunktionsnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bu49_hauptfunktionsnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bu49_funktionsergaenzung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bu49_funktionsergaenzung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art11");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt11");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art12");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt12");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art13");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art13"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt13");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt13"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art14");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art14"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt14");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt14"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art15");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art15"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt15");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt15"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art16");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art16"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt16");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt16"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art17");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art17"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt17");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt17"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art18");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art18"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt18");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt18"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art19");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art19"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt19");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt19"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_art20");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_art20"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zusatzinformation_inhalt20");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zusatzinformation_inhalt20"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stueck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stueck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gewicht");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gewicht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zahlweise");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlweise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forderungsart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forderungsart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("veranlagungsjahr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "veranlagungsjahr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zugeordnete_faelligkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zugeordnete_faelligkeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Rechnungsbetrag der Rechnungsposition als absoluter Betrag
     * (ggf. in Fremdwährung). */
    private String umsatz;
    /* „S“ oder „H“ */
    private String soll_haben_kz;
    /* Währung des Umsatzes, 3-stelliges Währungskennzeichen (z. B.
     * „EUR“) */
    private String wkz_umsatz;
    /* Leer falls Umsatz in Basiswährung, sonst der Wechselkurs für
     * die Umrechnung der Rechnungswährung in die Basiswährung. */
    private String kurs;
    /* Leer falls Umsatz in Basiswährung, sonst der in die Basiswährung
     * umgerechnete Umsatz. */
    private String basis_umsatz;
    /* Leer falls Umsatz in Basiswährung, sonst Währungskennzeichen
     * der Basiswährung. */
    private String wkz_basis_umsatz;
    /* Kundennummer. */
    private String konto;
    /* Das in der Rechnungsposition eingestellte Erlöskonto */
    private String gegenkonto;
    /* leer. */
    private String steuerschluessel;
    /* Rechnungsdatum im Format „TTMM“ (gem. DATEV-Spezifikation). */
    private String belegdatum;
    /* Rechnungsnummer */
    private String belegfeld1;
    /* leer */
    private String belegfeld2;
    /* leer */
    private String skonto;
    /* Kundenname */
    private String buchungstext;
    /* leer */
    private String postensperre;
    /* leer */
    private String diverse_adressNr;
    /* leer */
    private String geschaeftspartnerbank;
    /* leer */
    private String sachverhalt;
    /* leer */
    private String zinssperre;
    /* leer */
    private String beleglink;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_art1;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_inhalt1;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_art2;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_inhalt2;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_art3;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_inhalt3;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_art4;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_inhalt4;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_art5;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_inhalt5;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_art6;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_inhalt6;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_art7;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_inhalt7;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_art8;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String beleginfo_inhalt8;
    /* Kostenstelle */
    private String kost1;
    /* Kostenträger */
    private String kost2;
    /* leer */
    private String kost_menge;
    /* UID des Kunden */
    private String euLand_UStID;
    /* leer */
    private String eu_steuersatz;
    /* leer */
    private String abw_versteuerungsart;
    /* leer */
    private String sachverhalt_LL;
    /* leer */
    private String funktionsergaenzung_LL;
    /* leer */
    private String bu49_hauptfunktionstyp;
    /* leer */
    private String bu49_hauptfunktionsnummer;
    /* leer */
    private String bu49_funktionsergaenzung;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art1;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt1;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art2;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt2;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art3;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt3;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art4;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt4;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art5;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt5;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art6;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt6;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art7;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt7;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art8;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt8;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art9;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt9;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art10;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt10;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art11;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt11;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art12;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt12;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art13;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt13;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art14;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt14;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art15;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt15;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art16;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt16;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art17;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt17;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art18;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt18;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art19;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt19;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_art20;
    /* ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer. */
    private String zusatzinformation_inhalt20;
    /* leer */
    private String stueck;
    /* leer */
    private String gewicht;
    /* leer */
    private String zahlweise;
    /* leer */
    private String forderungsart;
    /* leer */
    private String veranlagungsjahr;
    /* leer */
    private String zugeordnete_faelligkeit;
    /* Für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DatevType() {
    }


    public DatevType(
            String umsatz,
            String soll_haben_kz,
            String wkz_umsatz,
            String kurs,
            String basis_umsatz,
            String wkz_basis_umsatz,
            String konto,
            String gegenkonto,
            String steuerschluessel,
            String belegdatum,
            String belegfeld1,
            String belegfeld2,
            String skonto,
            String buchungstext,
            String postensperre,
            String diverse_adressNr,
            String geschaeftspartnerbank,
            String sachverhalt,
            String zinssperre,
            String beleglink,
            String beleginfo_art1,
            String beleginfo_inhalt1,
            String beleginfo_art2,
            String beleginfo_inhalt2,
            String beleginfo_art3,
            String beleginfo_inhalt3,
            String beleginfo_art4,
            String beleginfo_inhalt4,
            String beleginfo_art5,
            String beleginfo_inhalt5,
            String beleginfo_art6,
            String beleginfo_inhalt6,
            String beleginfo_art7,
            String beleginfo_inhalt7,
            String beleginfo_art8,
            String beleginfo_inhalt8,
            String kost1,
            String kost2,
            String kost_menge,
            String euLand_UStID,
            String eu_steuersatz,
            String abw_versteuerungsart,
            String sachverhalt_LL,
            String funktionsergaenzung_LL,
            String bu49_hauptfunktionstyp,
            String bu49_hauptfunktionsnummer,
            String bu49_funktionsergaenzung,
            String zusatzinformation_art1,
            String zusatzinformation_inhalt1,
            String zusatzinformation_art2,
            String zusatzinformation_inhalt2,
            String zusatzinformation_art3,
            String zusatzinformation_inhalt3,
            String zusatzinformation_art4,
            String zusatzinformation_inhalt4,
            String zusatzinformation_art5,
            String zusatzinformation_inhalt5,
            String zusatzinformation_art6,
            String zusatzinformation_inhalt6,
            String zusatzinformation_art7,
            String zusatzinformation_inhalt7,
            String zusatzinformation_art8,
            String zusatzinformation_inhalt8,
            String zusatzinformation_art9,
            String zusatzinformation_inhalt9,
            String zusatzinformation_art10,
            String zusatzinformation_inhalt10,
            String zusatzinformation_art11,
            String zusatzinformation_inhalt11,
            String zusatzinformation_art12,
            String zusatzinformation_inhalt12,
            String zusatzinformation_art13,
            String zusatzinformation_inhalt13,
            String zusatzinformation_art14,
            String zusatzinformation_inhalt14,
            String zusatzinformation_art15,
            String zusatzinformation_inhalt15,
            String zusatzinformation_art16,
            String zusatzinformation_inhalt16,
            String zusatzinformation_art17,
            String zusatzinformation_inhalt17,
            String zusatzinformation_art18,
            String zusatzinformation_inhalt18,
            String zusatzinformation_art19,
            String zusatzinformation_inhalt19,
            String zusatzinformation_art20,
            String zusatzinformation_inhalt20,
            String stueck,
            String gewicht,
            String zahlweise,
            String forderungsart,
            String veranlagungsjahr,
            String zugeordnete_faelligkeit,
            AttributeType[] attributes) {
        this.umsatz = umsatz;
        this.soll_haben_kz = soll_haben_kz;
        this.wkz_umsatz = wkz_umsatz;
        this.kurs = kurs;
        this.basis_umsatz = basis_umsatz;
        this.wkz_basis_umsatz = wkz_basis_umsatz;
        this.konto = konto;
        this.gegenkonto = gegenkonto;
        this.steuerschluessel = steuerschluessel;
        this.belegdatum = belegdatum;
        this.belegfeld1 = belegfeld1;
        this.belegfeld2 = belegfeld2;
        this.skonto = skonto;
        this.buchungstext = buchungstext;
        this.postensperre = postensperre;
        this.diverse_adressNr = diverse_adressNr;
        this.geschaeftspartnerbank = geschaeftspartnerbank;
        this.sachverhalt = sachverhalt;
        this.zinssperre = zinssperre;
        this.beleglink = beleglink;
        this.beleginfo_art1 = beleginfo_art1;
        this.beleginfo_inhalt1 = beleginfo_inhalt1;
        this.beleginfo_art2 = beleginfo_art2;
        this.beleginfo_inhalt2 = beleginfo_inhalt2;
        this.beleginfo_art3 = beleginfo_art3;
        this.beleginfo_inhalt3 = beleginfo_inhalt3;
        this.beleginfo_art4 = beleginfo_art4;
        this.beleginfo_inhalt4 = beleginfo_inhalt4;
        this.beleginfo_art5 = beleginfo_art5;
        this.beleginfo_inhalt5 = beleginfo_inhalt5;
        this.beleginfo_art6 = beleginfo_art6;
        this.beleginfo_inhalt6 = beleginfo_inhalt6;
        this.beleginfo_art7 = beleginfo_art7;
        this.beleginfo_inhalt7 = beleginfo_inhalt7;
        this.beleginfo_art8 = beleginfo_art8;
        this.beleginfo_inhalt8 = beleginfo_inhalt8;
        this.kost1 = kost1;
        this.kost2 = kost2;
        this.kost_menge = kost_menge;
        this.euLand_UStID = euLand_UStID;
        this.eu_steuersatz = eu_steuersatz;
        this.abw_versteuerungsart = abw_versteuerungsart;
        this.sachverhalt_LL = sachverhalt_LL;
        this.funktionsergaenzung_LL = funktionsergaenzung_LL;
        this.bu49_hauptfunktionstyp = bu49_hauptfunktionstyp;
        this.bu49_hauptfunktionsnummer = bu49_hauptfunktionsnummer;
        this.bu49_funktionsergaenzung = bu49_funktionsergaenzung;
        this.zusatzinformation_art1 = zusatzinformation_art1;
        this.zusatzinformation_inhalt1 = zusatzinformation_inhalt1;
        this.zusatzinformation_art2 = zusatzinformation_art2;
        this.zusatzinformation_inhalt2 = zusatzinformation_inhalt2;
        this.zusatzinformation_art3 = zusatzinformation_art3;
        this.zusatzinformation_inhalt3 = zusatzinformation_inhalt3;
        this.zusatzinformation_art4 = zusatzinformation_art4;
        this.zusatzinformation_inhalt4 = zusatzinformation_inhalt4;
        this.zusatzinformation_art5 = zusatzinformation_art5;
        this.zusatzinformation_inhalt5 = zusatzinformation_inhalt5;
        this.zusatzinformation_art6 = zusatzinformation_art6;
        this.zusatzinformation_inhalt6 = zusatzinformation_inhalt6;
        this.zusatzinformation_art7 = zusatzinformation_art7;
        this.zusatzinformation_inhalt7 = zusatzinformation_inhalt7;
        this.zusatzinformation_art8 = zusatzinformation_art8;
        this.zusatzinformation_inhalt8 = zusatzinformation_inhalt8;
        this.zusatzinformation_art9 = zusatzinformation_art9;
        this.zusatzinformation_inhalt9 = zusatzinformation_inhalt9;
        this.zusatzinformation_art10 = zusatzinformation_art10;
        this.zusatzinformation_inhalt10 = zusatzinformation_inhalt10;
        this.zusatzinformation_art11 = zusatzinformation_art11;
        this.zusatzinformation_inhalt11 = zusatzinformation_inhalt11;
        this.zusatzinformation_art12 = zusatzinformation_art12;
        this.zusatzinformation_inhalt12 = zusatzinformation_inhalt12;
        this.zusatzinformation_art13 = zusatzinformation_art13;
        this.zusatzinformation_inhalt13 = zusatzinformation_inhalt13;
        this.zusatzinformation_art14 = zusatzinformation_art14;
        this.zusatzinformation_inhalt14 = zusatzinformation_inhalt14;
        this.zusatzinformation_art15 = zusatzinformation_art15;
        this.zusatzinformation_inhalt15 = zusatzinformation_inhalt15;
        this.zusatzinformation_art16 = zusatzinformation_art16;
        this.zusatzinformation_inhalt16 = zusatzinformation_inhalt16;
        this.zusatzinformation_art17 = zusatzinformation_art17;
        this.zusatzinformation_inhalt17 = zusatzinformation_inhalt17;
        this.zusatzinformation_art18 = zusatzinformation_art18;
        this.zusatzinformation_inhalt18 = zusatzinformation_inhalt18;
        this.zusatzinformation_art19 = zusatzinformation_art19;
        this.zusatzinformation_inhalt19 = zusatzinformation_inhalt19;
        this.zusatzinformation_art20 = zusatzinformation_art20;
        this.zusatzinformation_inhalt20 = zusatzinformation_inhalt20;
        this.stueck = stueck;
        this.gewicht = gewicht;
        this.zahlweise = zahlweise;
        this.forderungsart = forderungsart;
        this.veranlagungsjahr = veranlagungsjahr;
        this.zugeordnete_faelligkeit = zugeordnete_faelligkeit;
        this.attributes = attributes;
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the umsatz value for this DatevType.
     *
     * @return umsatz   * Rechnungsbetrag der Rechnungsposition als absoluter Betrag
     * (ggf. in Fremdwährung).
     */
    public String getUmsatz() {
        return umsatz;
    }

    /**
     * Sets the umsatz value for this DatevType.
     *
     * @param umsatz   * Rechnungsbetrag der Rechnungsposition als absoluter Betrag
     * (ggf. in Fremdwährung).
     */
    public void setUmsatz(String umsatz) {
        this.umsatz = umsatz;
    }

    /**
     * Gets the soll_haben_kz value for this DatevType.
     *
     * @return soll_haben_kz   * „S“ oder „H“
     */
    public String getSoll_haben_kz() {
        return soll_haben_kz;
    }

    /**
     * Sets the soll_haben_kz value for this DatevType.
     *
     * @param soll_haben_kz   * „S“ oder „H“
     */
    public void setSoll_haben_kz(String soll_haben_kz) {
        this.soll_haben_kz = soll_haben_kz;
    }

    /**
     * Gets the wkz_umsatz value for this DatevType.
     *
     * @return wkz_umsatz   * Währung des Umsatzes, 3-stelliges Währungskennzeichen (z. B.
     * „EUR“)
     */
    public String getWkz_umsatz() {
        return wkz_umsatz;
    }

    /**
     * Sets the wkz_umsatz value for this DatevType.
     *
     * @param wkz_umsatz   * Währung des Umsatzes, 3-stelliges Währungskennzeichen (z. B.
     * „EUR“)
     */
    public void setWkz_umsatz(String wkz_umsatz) {
        this.wkz_umsatz = wkz_umsatz;
    }

    /**
     * Gets the kurs value for this DatevType.
     *
     * @return kurs   * Leer falls Umsatz in Basiswährung, sonst der Wechselkurs für
     * die Umrechnung der Rechnungswährung in die Basiswährung.
     */
    public String getKurs() {
        return kurs;
    }

    /**
     * Sets the kurs value for this DatevType.
     *
     * @param kurs   * Leer falls Umsatz in Basiswährung, sonst der Wechselkurs für
     * die Umrechnung der Rechnungswährung in die Basiswährung.
     */
    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    /**
     * Gets the basis_umsatz value for this DatevType.
     *
     * @return basis_umsatz   * Leer falls Umsatz in Basiswährung, sonst der in die Basiswährung
     * umgerechnete Umsatz.
     */
    public String getBasis_umsatz() {
        return basis_umsatz;
    }

    /**
     * Sets the basis_umsatz value for this DatevType.
     *
     * @param basis_umsatz   * Leer falls Umsatz in Basiswährung, sonst der in die Basiswährung
     * umgerechnete Umsatz.
     */
    public void setBasis_umsatz(String basis_umsatz) {
        this.basis_umsatz = basis_umsatz;
    }

    /**
     * Gets the wkz_basis_umsatz value for this DatevType.
     *
     * @return wkz_basis_umsatz   * Leer falls Umsatz in Basiswährung, sonst Währungskennzeichen
     * der Basiswährung.
     */
    public String getWkz_basis_umsatz() {
        return wkz_basis_umsatz;
    }

    /**
     * Sets the wkz_basis_umsatz value for this DatevType.
     *
     * @param wkz_basis_umsatz   * Leer falls Umsatz in Basiswährung, sonst Währungskennzeichen
     * der Basiswährung.
     */
    public void setWkz_basis_umsatz(String wkz_basis_umsatz) {
        this.wkz_basis_umsatz = wkz_basis_umsatz;
    }

    /**
     * Gets the konto value for this DatevType.
     *
     * @return konto   * Kundennummer.
     */
    public String getKonto() {
        return konto;
    }

    /**
     * Sets the konto value for this DatevType.
     *
     * @param konto   * Kundennummer.
     */
    public void setKonto(String konto) {
        this.konto = konto;
    }

    /**
     * Gets the gegenkonto value for this DatevType.
     *
     * @return gegenkonto   * Das in der Rechnungsposition eingestellte Erlöskonto
     */
    public String getGegenkonto() {
        return gegenkonto;
    }

    /**
     * Sets the gegenkonto value for this DatevType.
     *
     * @param gegenkonto   * Das in der Rechnungsposition eingestellte Erlöskonto
     */
    public void setGegenkonto(String gegenkonto) {
        this.gegenkonto = gegenkonto;
    }

    /**
     * Gets the steuerschluessel value for this DatevType.
     *
     * @return steuerschluessel   * leer.
     */
    public String getSteuerschluessel() {
        return steuerschluessel;
    }

    /**
     * Sets the steuerschluessel value for this DatevType.
     *
     * @param steuerschluessel   * leer.
     */
    public void setSteuerschluessel(String steuerschluessel) {
        this.steuerschluessel = steuerschluessel;
    }

    /**
     * Gets the belegdatum value for this DatevType.
     *
     * @return belegdatum   * Rechnungsdatum im Format „TTMM“ (gem. DATEV-Spezifikation).
     */
    public String getBelegdatum() {
        return belegdatum;
    }

    /**
     * Sets the belegdatum value for this DatevType.
     *
     * @param belegdatum   * Rechnungsdatum im Format „TTMM“ (gem. DATEV-Spezifikation).
     */
    public void setBelegdatum(String belegdatum) {
        this.belegdatum = belegdatum;
    }

    /**
     * Gets the belegfeld1 value for this DatevType.
     *
     * @return belegfeld1   * Rechnungsnummer
     */
    public String getBelegfeld1() {
        return belegfeld1;
    }

    /**
     * Sets the belegfeld1 value for this DatevType.
     *
     * @param belegfeld1   * Rechnungsnummer
     */
    public void setBelegfeld1(String belegfeld1) {
        this.belegfeld1 = belegfeld1;
    }

    /**
     * Gets the belegfeld2 value for this DatevType.
     *
     * @return belegfeld2   * leer
     */
    public String getBelegfeld2() {
        return belegfeld2;
    }

    /**
     * Sets the belegfeld2 value for this DatevType.
     *
     * @param belegfeld2   * leer
     */
    public void setBelegfeld2(String belegfeld2) {
        this.belegfeld2 = belegfeld2;
    }

    /**
     * Gets the skonto value for this DatevType.
     *
     * @return skonto   * leer
     */
    public String getSkonto() {
        return skonto;
    }

    /**
     * Sets the skonto value for this DatevType.
     *
     * @param skonto   * leer
     */
    public void setSkonto(String skonto) {
        this.skonto = skonto;
    }

    /**
     * Gets the buchungstext value for this DatevType.
     *
     * @return buchungstext   * Kundenname
     */
    public String getBuchungstext() {
        return buchungstext;
    }

    /**
     * Sets the buchungstext value for this DatevType.
     *
     * @param buchungstext   * Kundenname
     */
    public void setBuchungstext(String buchungstext) {
        this.buchungstext = buchungstext;
    }

    /**
     * Gets the postensperre value for this DatevType.
     *
     * @return postensperre   * leer
     */
    public String getPostensperre() {
        return postensperre;
    }

    /**
     * Sets the postensperre value for this DatevType.
     *
     * @param postensperre   * leer
     */
    public void setPostensperre(String postensperre) {
        this.postensperre = postensperre;
    }

    /**
     * Gets the diverse_adressNr value for this DatevType.
     *
     * @return diverse_adressNr   * leer
     */
    public String getDiverse_adressNr() {
        return diverse_adressNr;
    }

    /**
     * Sets the diverse_adressNr value for this DatevType.
     *
     * @param diverse_adressNr   * leer
     */
    public void setDiverse_adressNr(String diverse_adressNr) {
        this.diverse_adressNr = diverse_adressNr;
    }

    /**
     * Gets the geschaeftspartnerbank value for this DatevType.
     *
     * @return geschaeftspartnerbank   * leer
     */
    public String getGeschaeftspartnerbank() {
        return geschaeftspartnerbank;
    }

    /**
     * Sets the geschaeftspartnerbank value for this DatevType.
     *
     * @param geschaeftspartnerbank   * leer
     */
    public void setGeschaeftspartnerbank(String geschaeftspartnerbank) {
        this.geschaeftspartnerbank = geschaeftspartnerbank;
    }

    /**
     * Gets the sachverhalt value for this DatevType.
     *
     * @return sachverhalt   * leer
     */
    public String getSachverhalt() {
        return sachverhalt;
    }

    /**
     * Sets the sachverhalt value for this DatevType.
     *
     * @param sachverhalt   * leer
     */
    public void setSachverhalt(String sachverhalt) {
        this.sachverhalt = sachverhalt;
    }

    /**
     * Gets the zinssperre value for this DatevType.
     *
     * @return zinssperre   * leer
     */
    public String getZinssperre() {
        return zinssperre;
    }

    /**
     * Sets the zinssperre value for this DatevType.
     *
     * @param zinssperre   * leer
     */
    public void setZinssperre(String zinssperre) {
        this.zinssperre = zinssperre;
    }

    /**
     * Gets the beleglink value for this DatevType.
     *
     * @return beleglink   * leer
     */
    public String getBeleglink() {
        return beleglink;
    }

    /**
     * Sets the beleglink value for this DatevType.
     *
     * @param beleglink   * leer
     */
    public void setBeleglink(String beleglink) {
        this.beleglink = beleglink;
    }

    /**
     * Gets the beleginfo_art1 value for this DatevType.
     *
     * @return beleginfo_art1   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_art1() {
        return beleginfo_art1;
    }

    /**
     * Sets the beleginfo_art1 value for this DatevType.
     *
     * @param beleginfo_art1   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_art1(String beleginfo_art1) {
        this.beleginfo_art1 = beleginfo_art1;
    }

    /**
     * Gets the beleginfo_inhalt1 value for this DatevType.
     *
     * @return beleginfo_inhalt1   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_inhalt1() {
        return beleginfo_inhalt1;
    }

    /**
     * Sets the beleginfo_inhalt1 value for this DatevType.
     *
     * @param beleginfo_inhalt1   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_inhalt1(String beleginfo_inhalt1) {
        this.beleginfo_inhalt1 = beleginfo_inhalt1;
    }

    /**
     * Gets the beleginfo_art2 value for this DatevType.
     *
     * @return beleginfo_art2   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_art2() {
        return beleginfo_art2;
    }

    /**
     * Sets the beleginfo_art2 value for this DatevType.
     *
     * @param beleginfo_art2   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_art2(String beleginfo_art2) {
        this.beleginfo_art2 = beleginfo_art2;
    }

    /**
     * Gets the beleginfo_inhalt2 value for this DatevType.
     *
     * @return beleginfo_inhalt2   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_inhalt2() {
        return beleginfo_inhalt2;
    }

    /**
     * Sets the beleginfo_inhalt2 value for this DatevType.
     *
     * @param beleginfo_inhalt2   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_inhalt2(String beleginfo_inhalt2) {
        this.beleginfo_inhalt2 = beleginfo_inhalt2;
    }

    /**
     * Gets the beleginfo_art3 value for this DatevType.
     *
     * @return beleginfo_art3   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_art3() {
        return beleginfo_art3;
    }

    /**
     * Sets the beleginfo_art3 value for this DatevType.
     *
     * @param beleginfo_art3   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_art3(String beleginfo_art3) {
        this.beleginfo_art3 = beleginfo_art3;
    }

    /**
     * Gets the beleginfo_inhalt3 value for this DatevType.
     *
     * @return beleginfo_inhalt3   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_inhalt3() {
        return beleginfo_inhalt3;
    }

    /**
     * Sets the beleginfo_inhalt3 value for this DatevType.
     *
     * @param beleginfo_inhalt3   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_inhalt3(String beleginfo_inhalt3) {
        this.beleginfo_inhalt3 = beleginfo_inhalt3;
    }

    /**
     * Gets the beleginfo_art4 value for this DatevType.
     *
     * @return beleginfo_art4   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_art4() {
        return beleginfo_art4;
    }

    /**
     * Sets the beleginfo_art4 value for this DatevType.
     *
     * @param beleginfo_art4   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_art4(String beleginfo_art4) {
        this.beleginfo_art4 = beleginfo_art4;
    }

    /**
     * Gets the beleginfo_inhalt4 value for this DatevType.
     *
     * @return beleginfo_inhalt4   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_inhalt4() {
        return beleginfo_inhalt4;
    }

    /**
     * Sets the beleginfo_inhalt4 value for this DatevType.
     *
     * @param beleginfo_inhalt4   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_inhalt4(String beleginfo_inhalt4) {
        this.beleginfo_inhalt4 = beleginfo_inhalt4;
    }

    /**
     * Gets the beleginfo_art5 value for this DatevType.
     *
     * @return beleginfo_art5   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_art5() {
        return beleginfo_art5;
    }

    /**
     * Sets the beleginfo_art5 value for this DatevType.
     *
     * @param beleginfo_art5   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_art5(String beleginfo_art5) {
        this.beleginfo_art5 = beleginfo_art5;
    }

    /**
     * Gets the beleginfo_inhalt5 value for this DatevType.
     *
     * @return beleginfo_inhalt5   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_inhalt5() {
        return beleginfo_inhalt5;
    }

    /**
     * Sets the beleginfo_inhalt5 value for this DatevType.
     *
     * @param beleginfo_inhalt5   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_inhalt5(String beleginfo_inhalt5) {
        this.beleginfo_inhalt5 = beleginfo_inhalt5;
    }

    /**
     * Gets the beleginfo_art6 value for this DatevType.
     *
     * @return beleginfo_art6   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_art6() {
        return beleginfo_art6;
    }

    /**
     * Sets the beleginfo_art6 value for this DatevType.
     *
     * @param beleginfo_art6   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_art6(String beleginfo_art6) {
        this.beleginfo_art6 = beleginfo_art6;
    }

    /**
     * Gets the beleginfo_inhalt6 value for this DatevType.
     *
     * @return beleginfo_inhalt6   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_inhalt6() {
        return beleginfo_inhalt6;
    }

    /**
     * Sets the beleginfo_inhalt6 value for this DatevType.
     *
     * @param beleginfo_inhalt6   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_inhalt6(String beleginfo_inhalt6) {
        this.beleginfo_inhalt6 = beleginfo_inhalt6;
    }

    /**
     * Gets the beleginfo_art7 value for this DatevType.
     *
     * @return beleginfo_art7   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_art7() {
        return beleginfo_art7;
    }

    /**
     * Sets the beleginfo_art7 value for this DatevType.
     *
     * @param beleginfo_art7   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_art7(String beleginfo_art7) {
        this.beleginfo_art7 = beleginfo_art7;
    }

    /**
     * Gets the beleginfo_inhalt7 value for this DatevType.
     *
     * @return beleginfo_inhalt7   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_inhalt7() {
        return beleginfo_inhalt7;
    }

    /**
     * Sets the beleginfo_inhalt7 value for this DatevType.
     *
     * @param beleginfo_inhalt7   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_inhalt7(String beleginfo_inhalt7) {
        this.beleginfo_inhalt7 = beleginfo_inhalt7;
    }

    /**
     * Gets the beleginfo_art8 value for this DatevType.
     *
     * @return beleginfo_art8   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_art8() {
        return beleginfo_art8;
    }

    /**
     * Sets the beleginfo_art8 value for this DatevType.
     *
     * @param beleginfo_art8   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_art8(String beleginfo_art8) {
        this.beleginfo_art8 = beleginfo_art8;
    }

    /**
     * Gets the beleginfo_inhalt8 value for this DatevType.
     *
     * @return beleginfo_inhalt8   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getBeleginfo_inhalt8() {
        return beleginfo_inhalt8;
    }

    /**
     * Sets the beleginfo_inhalt8 value for this DatevType.
     *
     * @param beleginfo_inhalt8   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setBeleginfo_inhalt8(String beleginfo_inhalt8) {
        this.beleginfo_inhalt8 = beleginfo_inhalt8;
    }

    /**
     * Gets the kost1 value for this DatevType.
     *
     * @return kost1   * Kostenstelle
     */
    public String getKost1() {
        return kost1;
    }

    /**
     * Sets the kost1 value for this DatevType.
     *
     * @param kost1   * Kostenstelle
     */
    public void setKost1(String kost1) {
        this.kost1 = kost1;
    }

    /**
     * Gets the kost2 value for this DatevType.
     *
     * @return kost2   * Kostenträger
     */
    public String getKost2() {
        return kost2;
    }

    /**
     * Sets the kost2 value for this DatevType.
     *
     * @param kost2   * Kostenträger
     */
    public void setKost2(String kost2) {
        this.kost2 = kost2;
    }

    /**
     * Gets the kost_menge value for this DatevType.
     *
     * @return kost_menge   * leer
     */
    public String getKost_menge() {
        return kost_menge;
    }

    /**
     * Sets the kost_menge value for this DatevType.
     *
     * @param kost_menge   * leer
     */
    public void setKost_menge(String kost_menge) {
        this.kost_menge = kost_menge;
    }

    /**
     * Gets the euLand_UStID value for this DatevType.
     *
     * @return euLand_UStID   * UID des Kunden
     */
    public String getEuLand_UStID() {
        return euLand_UStID;
    }

    /**
     * Sets the euLand_UStID value for this DatevType.
     *
     * @param euLand_UStID   * UID des Kunden
     */
    public void setEuLand_UStID(String euLand_UStID) {
        this.euLand_UStID = euLand_UStID;
    }

    /**
     * Gets the eu_steuersatz value for this DatevType.
     *
     * @return eu_steuersatz   * leer
     */
    public String getEu_steuersatz() {
        return eu_steuersatz;
    }

    /**
     * Sets the eu_steuersatz value for this DatevType.
     *
     * @param eu_steuersatz   * leer
     */
    public void setEu_steuersatz(String eu_steuersatz) {
        this.eu_steuersatz = eu_steuersatz;
    }

    /**
     * Gets the abw_versteuerungsart value for this DatevType.
     *
     * @return abw_versteuerungsart   * leer
     */
    public String getAbw_versteuerungsart() {
        return abw_versteuerungsart;
    }

    /**
     * Sets the abw_versteuerungsart value for this DatevType.
     *
     * @param abw_versteuerungsart   * leer
     */
    public void setAbw_versteuerungsart(String abw_versteuerungsart) {
        this.abw_versteuerungsart = abw_versteuerungsart;
    }

    /**
     * Gets the sachverhalt_LL value for this DatevType.
     *
     * @return sachverhalt_LL   * leer
     */
    public String getSachverhalt_LL() {
        return sachverhalt_LL;
    }

    /**
     * Sets the sachverhalt_LL value for this DatevType.
     *
     * @param sachverhalt_LL   * leer
     */
    public void setSachverhalt_LL(String sachverhalt_LL) {
        this.sachverhalt_LL = sachverhalt_LL;
    }

    /**
     * Gets the funktionsergaenzung_LL value for this DatevType.
     *
     * @return funktionsergaenzung_LL   * leer
     */
    public String getFunktionsergaenzung_LL() {
        return funktionsergaenzung_LL;
    }

    /**
     * Sets the funktionsergaenzung_LL value for this DatevType.
     *
     * @param funktionsergaenzung_LL   * leer
     */
    public void setFunktionsergaenzung_LL(String funktionsergaenzung_LL) {
        this.funktionsergaenzung_LL = funktionsergaenzung_LL;
    }

    /**
     * Gets the bu49_hauptfunktionstyp value for this DatevType.
     *
     * @return bu49_hauptfunktionstyp   * leer
     */
    public String getBu49_hauptfunktionstyp() {
        return bu49_hauptfunktionstyp;
    }

    /**
     * Sets the bu49_hauptfunktionstyp value for this DatevType.
     *
     * @param bu49_hauptfunktionstyp   * leer
     */
    public void setBu49_hauptfunktionstyp(String bu49_hauptfunktionstyp) {
        this.bu49_hauptfunktionstyp = bu49_hauptfunktionstyp;
    }

    /**
     * Gets the bu49_hauptfunktionsnummer value for this DatevType.
     *
     * @return bu49_hauptfunktionsnummer   * leer
     */
    public String getBu49_hauptfunktionsnummer() {
        return bu49_hauptfunktionsnummer;
    }

    /**
     * Sets the bu49_hauptfunktionsnummer value for this DatevType.
     *
     * @param bu49_hauptfunktionsnummer   * leer
     */
    public void setBu49_hauptfunktionsnummer(String bu49_hauptfunktionsnummer) {
        this.bu49_hauptfunktionsnummer = bu49_hauptfunktionsnummer;
    }

    /**
     * Gets the bu49_funktionsergaenzung value for this DatevType.
     *
     * @return bu49_funktionsergaenzung   * leer
     */
    public String getBu49_funktionsergaenzung() {
        return bu49_funktionsergaenzung;
    }

    /**
     * Sets the bu49_funktionsergaenzung value for this DatevType.
     *
     * @param bu49_funktionsergaenzung   * leer
     */
    public void setBu49_funktionsergaenzung(String bu49_funktionsergaenzung) {
        this.bu49_funktionsergaenzung = bu49_funktionsergaenzung;
    }

    /**
     * Gets the zusatzinformation_art1 value for this DatevType.
     *
     * @return zusatzinformation_art1   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art1() {
        return zusatzinformation_art1;
    }

    /**
     * Sets the zusatzinformation_art1 value for this DatevType.
     *
     * @param zusatzinformation_art1   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art1(String zusatzinformation_art1) {
        this.zusatzinformation_art1 = zusatzinformation_art1;
    }

    /**
     * Gets the zusatzinformation_inhalt1 value for this DatevType.
     *
     * @return zusatzinformation_inhalt1   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt1() {
        return zusatzinformation_inhalt1;
    }

    /**
     * Sets the zusatzinformation_inhalt1 value for this DatevType.
     *
     * @param zusatzinformation_inhalt1   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt1(String zusatzinformation_inhalt1) {
        this.zusatzinformation_inhalt1 = zusatzinformation_inhalt1;
    }

    /**
     * Gets the zusatzinformation_art2 value for this DatevType.
     *
     * @return zusatzinformation_art2   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art2() {
        return zusatzinformation_art2;
    }

    /**
     * Sets the zusatzinformation_art2 value for this DatevType.
     *
     * @param zusatzinformation_art2   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art2(String zusatzinformation_art2) {
        this.zusatzinformation_art2 = zusatzinformation_art2;
    }

    /**
     * Gets the zusatzinformation_inhalt2 value for this DatevType.
     *
     * @return zusatzinformation_inhalt2   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt2() {
        return zusatzinformation_inhalt2;
    }

    /**
     * Sets the zusatzinformation_inhalt2 value for this DatevType.
     *
     * @param zusatzinformation_inhalt2   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt2(String zusatzinformation_inhalt2) {
        this.zusatzinformation_inhalt2 = zusatzinformation_inhalt2;
    }

    /**
     * Gets the zusatzinformation_art3 value for this DatevType.
     *
     * @return zusatzinformation_art3   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art3() {
        return zusatzinformation_art3;
    }

    /**
     * Sets the zusatzinformation_art3 value for this DatevType.
     *
     * @param zusatzinformation_art3   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art3(String zusatzinformation_art3) {
        this.zusatzinformation_art3 = zusatzinformation_art3;
    }

    /**
     * Gets the zusatzinformation_inhalt3 value for this DatevType.
     *
     * @return zusatzinformation_inhalt3   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt3() {
        return zusatzinformation_inhalt3;
    }

    /**
     * Sets the zusatzinformation_inhalt3 value for this DatevType.
     *
     * @param zusatzinformation_inhalt3   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt3(String zusatzinformation_inhalt3) {
        this.zusatzinformation_inhalt3 = zusatzinformation_inhalt3;
    }

    /**
     * Gets the zusatzinformation_art4 value for this DatevType.
     *
     * @return zusatzinformation_art4   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art4() {
        return zusatzinformation_art4;
    }

    /**
     * Sets the zusatzinformation_art4 value for this DatevType.
     *
     * @param zusatzinformation_art4   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art4(String zusatzinformation_art4) {
        this.zusatzinformation_art4 = zusatzinformation_art4;
    }

    /**
     * Gets the zusatzinformation_inhalt4 value for this DatevType.
     *
     * @return zusatzinformation_inhalt4   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt4() {
        return zusatzinformation_inhalt4;
    }

    /**
     * Sets the zusatzinformation_inhalt4 value for this DatevType.
     *
     * @param zusatzinformation_inhalt4   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt4(String zusatzinformation_inhalt4) {
        this.zusatzinformation_inhalt4 = zusatzinformation_inhalt4;
    }

    /**
     * Gets the zusatzinformation_art5 value for this DatevType.
     *
     * @return zusatzinformation_art5   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art5() {
        return zusatzinformation_art5;
    }

    /**
     * Sets the zusatzinformation_art5 value for this DatevType.
     *
     * @param zusatzinformation_art5   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art5(String zusatzinformation_art5) {
        this.zusatzinformation_art5 = zusatzinformation_art5;
    }

    /**
     * Gets the zusatzinformation_inhalt5 value for this DatevType.
     *
     * @return zusatzinformation_inhalt5   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt5() {
        return zusatzinformation_inhalt5;
    }

    /**
     * Sets the zusatzinformation_inhalt5 value for this DatevType.
     *
     * @param zusatzinformation_inhalt5   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt5(String zusatzinformation_inhalt5) {
        this.zusatzinformation_inhalt5 = zusatzinformation_inhalt5;
    }

    /**
     * Gets the zusatzinformation_art6 value for this DatevType.
     *
     * @return zusatzinformation_art6   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art6() {
        return zusatzinformation_art6;
    }

    /**
     * Sets the zusatzinformation_art6 value for this DatevType.
     *
     * @param zusatzinformation_art6   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art6(String zusatzinformation_art6) {
        this.zusatzinformation_art6 = zusatzinformation_art6;
    }

    /**
     * Gets the zusatzinformation_inhalt6 value for this DatevType.
     *
     * @return zusatzinformation_inhalt6   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt6() {
        return zusatzinformation_inhalt6;
    }

    /**
     * Sets the zusatzinformation_inhalt6 value for this DatevType.
     *
     * @param zusatzinformation_inhalt6   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt6(String zusatzinformation_inhalt6) {
        this.zusatzinformation_inhalt6 = zusatzinformation_inhalt6;
    }

    /**
     * Gets the zusatzinformation_art7 value for this DatevType.
     *
     * @return zusatzinformation_art7   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art7() {
        return zusatzinformation_art7;
    }

    /**
     * Sets the zusatzinformation_art7 value for this DatevType.
     *
     * @param zusatzinformation_art7   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art7(String zusatzinformation_art7) {
        this.zusatzinformation_art7 = zusatzinformation_art7;
    }

    /**
     * Gets the zusatzinformation_inhalt7 value for this DatevType.
     *
     * @return zusatzinformation_inhalt7   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt7() {
        return zusatzinformation_inhalt7;
    }

    /**
     * Sets the zusatzinformation_inhalt7 value for this DatevType.
     *
     * @param zusatzinformation_inhalt7   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt7(String zusatzinformation_inhalt7) {
        this.zusatzinformation_inhalt7 = zusatzinformation_inhalt7;
    }

    /**
     * Gets the zusatzinformation_art8 value for this DatevType.
     *
     * @return zusatzinformation_art8   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art8() {
        return zusatzinformation_art8;
    }

    /**
     * Sets the zusatzinformation_art8 value for this DatevType.
     *
     * @param zusatzinformation_art8   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art8(String zusatzinformation_art8) {
        this.zusatzinformation_art8 = zusatzinformation_art8;
    }

    /**
     * Gets the zusatzinformation_inhalt8 value for this DatevType.
     *
     * @return zusatzinformation_inhalt8   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt8() {
        return zusatzinformation_inhalt8;
    }

    /**
     * Sets the zusatzinformation_inhalt8 value for this DatevType.
     *
     * @param zusatzinformation_inhalt8   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt8(String zusatzinformation_inhalt8) {
        this.zusatzinformation_inhalt8 = zusatzinformation_inhalt8;
    }

    /**
     * Gets the zusatzinformation_art9 value for this DatevType.
     *
     * @return zusatzinformation_art9   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art9() {
        return zusatzinformation_art9;
    }

    /**
     * Sets the zusatzinformation_art9 value for this DatevType.
     *
     * @param zusatzinformation_art9   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art9(String zusatzinformation_art9) {
        this.zusatzinformation_art9 = zusatzinformation_art9;
    }

    /**
     * Gets the zusatzinformation_inhalt9 value for this DatevType.
     *
     * @return zusatzinformation_inhalt9   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt9() {
        return zusatzinformation_inhalt9;
    }

    /**
     * Sets the zusatzinformation_inhalt9 value for this DatevType.
     *
     * @param zusatzinformation_inhalt9   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt9(String zusatzinformation_inhalt9) {
        this.zusatzinformation_inhalt9 = zusatzinformation_inhalt9;
    }

    /**
     * Gets the zusatzinformation_art10 value for this DatevType.
     *
     * @return zusatzinformation_art10   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art10() {
        return zusatzinformation_art10;
    }

    /**
     * Sets the zusatzinformation_art10 value for this DatevType.
     *
     * @param zusatzinformation_art10   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art10(String zusatzinformation_art10) {
        this.zusatzinformation_art10 = zusatzinformation_art10;
    }

    /**
     * Gets the zusatzinformation_inhalt10 value for this DatevType.
     *
     * @return zusatzinformation_inhalt10   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt10() {
        return zusatzinformation_inhalt10;
    }

    /**
     * Sets the zusatzinformation_inhalt10 value for this DatevType.
     *
     * @param zusatzinformation_inhalt10   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt10(String zusatzinformation_inhalt10) {
        this.zusatzinformation_inhalt10 = zusatzinformation_inhalt10;
    }

    /**
     * Gets the zusatzinformation_art11 value for this DatevType.
     *
     * @return zusatzinformation_art11   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art11() {
        return zusatzinformation_art11;
    }

    /**
     * Sets the zusatzinformation_art11 value for this DatevType.
     *
     * @param zusatzinformation_art11   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art11(String zusatzinformation_art11) {
        this.zusatzinformation_art11 = zusatzinformation_art11;
    }

    /**
     * Gets the zusatzinformation_inhalt11 value for this DatevType.
     *
     * @return zusatzinformation_inhalt11   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt11() {
        return zusatzinformation_inhalt11;
    }

    /**
     * Sets the zusatzinformation_inhalt11 value for this DatevType.
     *
     * @param zusatzinformation_inhalt11   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt11(String zusatzinformation_inhalt11) {
        this.zusatzinformation_inhalt11 = zusatzinformation_inhalt11;
    }

    /**
     * Gets the zusatzinformation_art12 value for this DatevType.
     *
     * @return zusatzinformation_art12   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art12() {
        return zusatzinformation_art12;
    }

    /**
     * Sets the zusatzinformation_art12 value for this DatevType.
     *
     * @param zusatzinformation_art12   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art12(String zusatzinformation_art12) {
        this.zusatzinformation_art12 = zusatzinformation_art12;
    }

    /**
     * Gets the zusatzinformation_inhalt12 value for this DatevType.
     *
     * @return zusatzinformation_inhalt12   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt12() {
        return zusatzinformation_inhalt12;
    }

    /**
     * Sets the zusatzinformation_inhalt12 value for this DatevType.
     *
     * @param zusatzinformation_inhalt12   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt12(String zusatzinformation_inhalt12) {
        this.zusatzinformation_inhalt12 = zusatzinformation_inhalt12;
    }

    /**
     * Gets the zusatzinformation_art13 value for this DatevType.
     *
     * @return zusatzinformation_art13   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art13() {
        return zusatzinformation_art13;
    }

    /**
     * Sets the zusatzinformation_art13 value for this DatevType.
     *
     * @param zusatzinformation_art13   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art13(String zusatzinformation_art13) {
        this.zusatzinformation_art13 = zusatzinformation_art13;
    }

    /**
     * Gets the zusatzinformation_inhalt13 value for this DatevType.
     *
     * @return zusatzinformation_inhalt13   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt13() {
        return zusatzinformation_inhalt13;
    }

    /**
     * Sets the zusatzinformation_inhalt13 value for this DatevType.
     *
     * @param zusatzinformation_inhalt13   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt13(String zusatzinformation_inhalt13) {
        this.zusatzinformation_inhalt13 = zusatzinformation_inhalt13;
    }

    /**
     * Gets the zusatzinformation_art14 value for this DatevType.
     *
     * @return zusatzinformation_art14   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art14() {
        return zusatzinformation_art14;
    }

    /**
     * Sets the zusatzinformation_art14 value for this DatevType.
     *
     * @param zusatzinformation_art14   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art14(String zusatzinformation_art14) {
        this.zusatzinformation_art14 = zusatzinformation_art14;
    }

    /**
     * Gets the zusatzinformation_inhalt14 value for this DatevType.
     *
     * @return zusatzinformation_inhalt14   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt14() {
        return zusatzinformation_inhalt14;
    }

    /**
     * Sets the zusatzinformation_inhalt14 value for this DatevType.
     *
     * @param zusatzinformation_inhalt14   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt14(String zusatzinformation_inhalt14) {
        this.zusatzinformation_inhalt14 = zusatzinformation_inhalt14;
    }

    /**
     * Gets the zusatzinformation_art15 value for this DatevType.
     *
     * @return zusatzinformation_art15   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art15() {
        return zusatzinformation_art15;
    }

    /**
     * Sets the zusatzinformation_art15 value for this DatevType.
     *
     * @param zusatzinformation_art15   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art15(String zusatzinformation_art15) {
        this.zusatzinformation_art15 = zusatzinformation_art15;
    }

    /**
     * Gets the zusatzinformation_inhalt15 value for this DatevType.
     *
     * @return zusatzinformation_inhalt15   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt15() {
        return zusatzinformation_inhalt15;
    }

    /**
     * Sets the zusatzinformation_inhalt15 value for this DatevType.
     *
     * @param zusatzinformation_inhalt15   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt15(String zusatzinformation_inhalt15) {
        this.zusatzinformation_inhalt15 = zusatzinformation_inhalt15;
    }

    /**
     * Gets the zusatzinformation_art16 value for this DatevType.
     *
     * @return zusatzinformation_art16   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art16() {
        return zusatzinformation_art16;
    }

    /**
     * Sets the zusatzinformation_art16 value for this DatevType.
     *
     * @param zusatzinformation_art16   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art16(String zusatzinformation_art16) {
        this.zusatzinformation_art16 = zusatzinformation_art16;
    }

    /**
     * Gets the zusatzinformation_inhalt16 value for this DatevType.
     *
     * @return zusatzinformation_inhalt16   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt16() {
        return zusatzinformation_inhalt16;
    }

    /**
     * Sets the zusatzinformation_inhalt16 value for this DatevType.
     *
     * @param zusatzinformation_inhalt16   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt16(String zusatzinformation_inhalt16) {
        this.zusatzinformation_inhalt16 = zusatzinformation_inhalt16;
    }

    /**
     * Gets the zusatzinformation_art17 value for this DatevType.
     *
     * @return zusatzinformation_art17   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art17() {
        return zusatzinformation_art17;
    }

    /**
     * Sets the zusatzinformation_art17 value for this DatevType.
     *
     * @param zusatzinformation_art17   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art17(String zusatzinformation_art17) {
        this.zusatzinformation_art17 = zusatzinformation_art17;
    }

    /**
     * Gets the zusatzinformation_inhalt17 value for this DatevType.
     *
     * @return zusatzinformation_inhalt17   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt17() {
        return zusatzinformation_inhalt17;
    }

    /**
     * Sets the zusatzinformation_inhalt17 value for this DatevType.
     *
     * @param zusatzinformation_inhalt17   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt17(String zusatzinformation_inhalt17) {
        this.zusatzinformation_inhalt17 = zusatzinformation_inhalt17;
    }

    /**
     * Gets the zusatzinformation_art18 value for this DatevType.
     *
     * @return zusatzinformation_art18   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art18() {
        return zusatzinformation_art18;
    }

    /**
     * Sets the zusatzinformation_art18 value for this DatevType.
     *
     * @param zusatzinformation_art18   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art18(String zusatzinformation_art18) {
        this.zusatzinformation_art18 = zusatzinformation_art18;
    }

    /**
     * Gets the zusatzinformation_inhalt18 value for this DatevType.
     *
     * @return zusatzinformation_inhalt18   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt18() {
        return zusatzinformation_inhalt18;
    }

    /**
     * Sets the zusatzinformation_inhalt18 value for this DatevType.
     *
     * @param zusatzinformation_inhalt18   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt18(String zusatzinformation_inhalt18) {
        this.zusatzinformation_inhalt18 = zusatzinformation_inhalt18;
    }

    /**
     * Gets the zusatzinformation_art19 value for this DatevType.
     *
     * @return zusatzinformation_art19   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art19() {
        return zusatzinformation_art19;
    }

    /**
     * Sets the zusatzinformation_art19 value for this DatevType.
     *
     * @param zusatzinformation_art19   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art19(String zusatzinformation_art19) {
        this.zusatzinformation_art19 = zusatzinformation_art19;
    }

    /**
     * Gets the zusatzinformation_inhalt19 value for this DatevType.
     *
     * @return zusatzinformation_inhalt19   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt19() {
        return zusatzinformation_inhalt19;
    }

    /**
     * Sets the zusatzinformation_inhalt19 value for this DatevType.
     *
     * @param zusatzinformation_inhalt19   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt19(String zusatzinformation_inhalt19) {
        this.zusatzinformation_inhalt19 = zusatzinformation_inhalt19;
    }

    /**
     * Gets the zusatzinformation_art20 value for this DatevType.
     *
     * @return zusatzinformation_art20   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_art20() {
        return zusatzinformation_art20;
    }

    /**
     * Sets the zusatzinformation_art20 value for this DatevType.
     *
     * @param zusatzinformation_art20   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_art20(String zusatzinformation_art20) {
        this.zusatzinformation_art20 = zusatzinformation_art20;
    }

    /**
     * Gets the zusatzinformation_inhalt20 value for this DatevType.
     *
     * @return zusatzinformation_inhalt20   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public String getZusatzinformation_inhalt20() {
        return zusatzinformation_inhalt20;
    }

    /**
     * Sets the zusatzinformation_inhalt20 value for this DatevType.
     *
     * @param zusatzinformation_inhalt20   * ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
     */
    public void setZusatzinformation_inhalt20(String zusatzinformation_inhalt20) {
        this.zusatzinformation_inhalt20 = zusatzinformation_inhalt20;
    }

    /**
     * Gets the stueck value for this DatevType.
     *
     * @return stueck   * leer
     */
    public String getStueck() {
        return stueck;
    }

    /**
     * Sets the stueck value for this DatevType.
     *
     * @param stueck   * leer
     */
    public void setStueck(String stueck) {
        this.stueck = stueck;
    }

    /**
     * Gets the gewicht value for this DatevType.
     *
     * @return gewicht   * leer
     */
    public String getGewicht() {
        return gewicht;
    }

    /**
     * Sets the gewicht value for this DatevType.
     *
     * @param gewicht   * leer
     */
    public void setGewicht(String gewicht) {
        this.gewicht = gewicht;
    }

    /**
     * Gets the zahlweise value for this DatevType.
     *
     * @return zahlweise   * leer
     */
    public String getZahlweise() {
        return zahlweise;
    }

    /**
     * Sets the zahlweise value for this DatevType.
     *
     * @param zahlweise   * leer
     */
    public void setZahlweise(String zahlweise) {
        this.zahlweise = zahlweise;
    }

    /**
     * Gets the forderungsart value for this DatevType.
     *
     * @return forderungsart   * leer
     */
    public String getForderungsart() {
        return forderungsart;
    }

    /**
     * Sets the forderungsart value for this DatevType.
     *
     * @param forderungsart   * leer
     */
    public void setForderungsart(String forderungsart) {
        this.forderungsart = forderungsart;
    }

    /**
     * Gets the veranlagungsjahr value for this DatevType.
     *
     * @return veranlagungsjahr   * leer
     */
    public String getVeranlagungsjahr() {
        return veranlagungsjahr;
    }

    /**
     * Sets the veranlagungsjahr value for this DatevType.
     *
     * @param veranlagungsjahr   * leer
     */
    public void setVeranlagungsjahr(String veranlagungsjahr) {
        this.veranlagungsjahr = veranlagungsjahr;
    }

    /**
     * Gets the zugeordnete_faelligkeit value for this DatevType.
     *
     * @return zugeordnete_faelligkeit   * leer
     */
    public String getZugeordnete_faelligkeit() {
        return zugeordnete_faelligkeit;
    }

    /**
     * Sets the zugeordnete_faelligkeit value for this DatevType.
     *
     * @param zugeordnete_faelligkeit   * leer
     */
    public void setZugeordnete_faelligkeit(String zugeordnete_faelligkeit) {
        this.zugeordnete_faelligkeit = zugeordnete_faelligkeit;
    }

    /**
     * Gets the attributes value for this DatevType.
     *
     * @return attributes   * Für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this DatevType.
     *
     * @param attributes   * Für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DatevType)) return false;
        DatevType other = (DatevType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.umsatz == null && other.getUmsatz() == null) ||
                        (this.umsatz != null &&
                                this.umsatz.equals(other.getUmsatz()))) &&
                ((this.soll_haben_kz == null && other.getSoll_haben_kz() == null) ||
                        (this.soll_haben_kz != null &&
                                this.soll_haben_kz.equals(other.getSoll_haben_kz()))) &&
                ((this.wkz_umsatz == null && other.getWkz_umsatz() == null) ||
                        (this.wkz_umsatz != null &&
                                this.wkz_umsatz.equals(other.getWkz_umsatz()))) &&
                ((this.kurs == null && other.getKurs() == null) ||
                        (this.kurs != null &&
                                this.kurs.equals(other.getKurs()))) &&
                ((this.basis_umsatz == null && other.getBasis_umsatz() == null) ||
                        (this.basis_umsatz != null &&
                                this.basis_umsatz.equals(other.getBasis_umsatz()))) &&
                ((this.wkz_basis_umsatz == null && other.getWkz_basis_umsatz() == null) ||
                        (this.wkz_basis_umsatz != null &&
                                this.wkz_basis_umsatz.equals(other.getWkz_basis_umsatz()))) &&
                ((this.konto == null && other.getKonto() == null) ||
                        (this.konto != null &&
                                this.konto.equals(other.getKonto()))) &&
                ((this.gegenkonto == null && other.getGegenkonto() == null) ||
                        (this.gegenkonto != null &&
                                this.gegenkonto.equals(other.getGegenkonto()))) &&
                ((this.steuerschluessel == null && other.getSteuerschluessel() == null) ||
                        (this.steuerschluessel != null &&
                                this.steuerschluessel.equals(other.getSteuerschluessel()))) &&
                ((this.belegdatum == null && other.getBelegdatum() == null) ||
                        (this.belegdatum != null &&
                                this.belegdatum.equals(other.getBelegdatum()))) &&
                ((this.belegfeld1 == null && other.getBelegfeld1() == null) ||
                        (this.belegfeld1 != null &&
                                this.belegfeld1.equals(other.getBelegfeld1()))) &&
                ((this.belegfeld2 == null && other.getBelegfeld2() == null) ||
                        (this.belegfeld2 != null &&
                                this.belegfeld2.equals(other.getBelegfeld2()))) &&
                ((this.skonto == null && other.getSkonto() == null) ||
                        (this.skonto != null &&
                                this.skonto.equals(other.getSkonto()))) &&
                ((this.buchungstext == null && other.getBuchungstext() == null) ||
                        (this.buchungstext != null &&
                                this.buchungstext.equals(other.getBuchungstext()))) &&
                ((this.postensperre == null && other.getPostensperre() == null) ||
                        (this.postensperre != null &&
                                this.postensperre.equals(other.getPostensperre()))) &&
                ((this.diverse_adressNr == null && other.getDiverse_adressNr() == null) ||
                        (this.diverse_adressNr != null &&
                                this.diverse_adressNr.equals(other.getDiverse_adressNr()))) &&
                ((this.geschaeftspartnerbank == null && other.getGeschaeftspartnerbank() == null) ||
                        (this.geschaeftspartnerbank != null &&
                                this.geschaeftspartnerbank.equals(other.getGeschaeftspartnerbank()))) &&
                ((this.sachverhalt == null && other.getSachverhalt() == null) ||
                        (this.sachverhalt != null &&
                                this.sachverhalt.equals(other.getSachverhalt()))) &&
                ((this.zinssperre == null && other.getZinssperre() == null) ||
                        (this.zinssperre != null &&
                                this.zinssperre.equals(other.getZinssperre()))) &&
                ((this.beleglink == null && other.getBeleglink() == null) ||
                        (this.beleglink != null &&
                                this.beleglink.equals(other.getBeleglink()))) &&
                ((this.beleginfo_art1 == null && other.getBeleginfo_art1() == null) ||
                        (this.beleginfo_art1 != null &&
                                this.beleginfo_art1.equals(other.getBeleginfo_art1()))) &&
                ((this.beleginfo_inhalt1 == null && other.getBeleginfo_inhalt1() == null) ||
                        (this.beleginfo_inhalt1 != null &&
                                this.beleginfo_inhalt1.equals(other.getBeleginfo_inhalt1()))) &&
                ((this.beleginfo_art2 == null && other.getBeleginfo_art2() == null) ||
                        (this.beleginfo_art2 != null &&
                                this.beleginfo_art2.equals(other.getBeleginfo_art2()))) &&
                ((this.beleginfo_inhalt2 == null && other.getBeleginfo_inhalt2() == null) ||
                        (this.beleginfo_inhalt2 != null &&
                                this.beleginfo_inhalt2.equals(other.getBeleginfo_inhalt2()))) &&
                ((this.beleginfo_art3 == null && other.getBeleginfo_art3() == null) ||
                        (this.beleginfo_art3 != null &&
                                this.beleginfo_art3.equals(other.getBeleginfo_art3()))) &&
                ((this.beleginfo_inhalt3 == null && other.getBeleginfo_inhalt3() == null) ||
                        (this.beleginfo_inhalt3 != null &&
                                this.beleginfo_inhalt3.equals(other.getBeleginfo_inhalt3()))) &&
                ((this.beleginfo_art4 == null && other.getBeleginfo_art4() == null) ||
                        (this.beleginfo_art4 != null &&
                                this.beleginfo_art4.equals(other.getBeleginfo_art4()))) &&
                ((this.beleginfo_inhalt4 == null && other.getBeleginfo_inhalt4() == null) ||
                        (this.beleginfo_inhalt4 != null &&
                                this.beleginfo_inhalt4.equals(other.getBeleginfo_inhalt4()))) &&
                ((this.beleginfo_art5 == null && other.getBeleginfo_art5() == null) ||
                        (this.beleginfo_art5 != null &&
                                this.beleginfo_art5.equals(other.getBeleginfo_art5()))) &&
                ((this.beleginfo_inhalt5 == null && other.getBeleginfo_inhalt5() == null) ||
                        (this.beleginfo_inhalt5 != null &&
                                this.beleginfo_inhalt5.equals(other.getBeleginfo_inhalt5()))) &&
                ((this.beleginfo_art6 == null && other.getBeleginfo_art6() == null) ||
                        (this.beleginfo_art6 != null &&
                                this.beleginfo_art6.equals(other.getBeleginfo_art6()))) &&
                ((this.beleginfo_inhalt6 == null && other.getBeleginfo_inhalt6() == null) ||
                        (this.beleginfo_inhalt6 != null &&
                                this.beleginfo_inhalt6.equals(other.getBeleginfo_inhalt6()))) &&
                ((this.beleginfo_art7 == null && other.getBeleginfo_art7() == null) ||
                        (this.beleginfo_art7 != null &&
                                this.beleginfo_art7.equals(other.getBeleginfo_art7()))) &&
                ((this.beleginfo_inhalt7 == null && other.getBeleginfo_inhalt7() == null) ||
                        (this.beleginfo_inhalt7 != null &&
                                this.beleginfo_inhalt7.equals(other.getBeleginfo_inhalt7()))) &&
                ((this.beleginfo_art8 == null && other.getBeleginfo_art8() == null) ||
                        (this.beleginfo_art8 != null &&
                                this.beleginfo_art8.equals(other.getBeleginfo_art8()))) &&
                ((this.beleginfo_inhalt8 == null && other.getBeleginfo_inhalt8() == null) ||
                        (this.beleginfo_inhalt8 != null &&
                                this.beleginfo_inhalt8.equals(other.getBeleginfo_inhalt8()))) &&
                ((this.kost1 == null && other.getKost1() == null) ||
                        (this.kost1 != null &&
                                this.kost1.equals(other.getKost1()))) &&
                ((this.kost2 == null && other.getKost2() == null) ||
                        (this.kost2 != null &&
                                this.kost2.equals(other.getKost2()))) &&
                ((this.kost_menge == null && other.getKost_menge() == null) ||
                        (this.kost_menge != null &&
                                this.kost_menge.equals(other.getKost_menge()))) &&
                ((this.euLand_UStID == null && other.getEuLand_UStID() == null) ||
                        (this.euLand_UStID != null &&
                                this.euLand_UStID.equals(other.getEuLand_UStID()))) &&
                ((this.eu_steuersatz == null && other.getEu_steuersatz() == null) ||
                        (this.eu_steuersatz != null &&
                                this.eu_steuersatz.equals(other.getEu_steuersatz()))) &&
                ((this.abw_versteuerungsart == null && other.getAbw_versteuerungsart() == null) ||
                        (this.abw_versteuerungsart != null &&
                                this.abw_versteuerungsart.equals(other.getAbw_versteuerungsart()))) &&
                ((this.sachverhalt_LL == null && other.getSachverhalt_LL() == null) ||
                        (this.sachverhalt_LL != null &&
                                this.sachverhalt_LL.equals(other.getSachverhalt_LL()))) &&
                ((this.funktionsergaenzung_LL == null && other.getFunktionsergaenzung_LL() == null) ||
                        (this.funktionsergaenzung_LL != null &&
                                this.funktionsergaenzung_LL.equals(other.getFunktionsergaenzung_LL()))) &&
                ((this.bu49_hauptfunktionstyp == null && other.getBu49_hauptfunktionstyp() == null) ||
                        (this.bu49_hauptfunktionstyp != null &&
                                this.bu49_hauptfunktionstyp.equals(other.getBu49_hauptfunktionstyp()))) &&
                ((this.bu49_hauptfunktionsnummer == null && other.getBu49_hauptfunktionsnummer() == null) ||
                        (this.bu49_hauptfunktionsnummer != null &&
                                this.bu49_hauptfunktionsnummer.equals(other.getBu49_hauptfunktionsnummer()))) &&
                ((this.bu49_funktionsergaenzung == null && other.getBu49_funktionsergaenzung() == null) ||
                        (this.bu49_funktionsergaenzung != null &&
                                this.bu49_funktionsergaenzung.equals(other.getBu49_funktionsergaenzung()))) &&
                ((this.zusatzinformation_art1 == null && other.getZusatzinformation_art1() == null) ||
                        (this.zusatzinformation_art1 != null &&
                                this.zusatzinformation_art1.equals(other.getZusatzinformation_art1()))) &&
                ((this.zusatzinformation_inhalt1 == null && other.getZusatzinformation_inhalt1() == null) ||
                        (this.zusatzinformation_inhalt1 != null &&
                                this.zusatzinformation_inhalt1.equals(other.getZusatzinformation_inhalt1()))) &&
                ((this.zusatzinformation_art2 == null && other.getZusatzinformation_art2() == null) ||
                        (this.zusatzinformation_art2 != null &&
                                this.zusatzinformation_art2.equals(other.getZusatzinformation_art2()))) &&
                ((this.zusatzinformation_inhalt2 == null && other.getZusatzinformation_inhalt2() == null) ||
                        (this.zusatzinformation_inhalt2 != null &&
                                this.zusatzinformation_inhalt2.equals(other.getZusatzinformation_inhalt2()))) &&
                ((this.zusatzinformation_art3 == null && other.getZusatzinformation_art3() == null) ||
                        (this.zusatzinformation_art3 != null &&
                                this.zusatzinformation_art3.equals(other.getZusatzinformation_art3()))) &&
                ((this.zusatzinformation_inhalt3 == null && other.getZusatzinformation_inhalt3() == null) ||
                        (this.zusatzinformation_inhalt3 != null &&
                                this.zusatzinformation_inhalt3.equals(other.getZusatzinformation_inhalt3()))) &&
                ((this.zusatzinformation_art4 == null && other.getZusatzinformation_art4() == null) ||
                        (this.zusatzinformation_art4 != null &&
                                this.zusatzinformation_art4.equals(other.getZusatzinformation_art4()))) &&
                ((this.zusatzinformation_inhalt4 == null && other.getZusatzinformation_inhalt4() == null) ||
                        (this.zusatzinformation_inhalt4 != null &&
                                this.zusatzinformation_inhalt4.equals(other.getZusatzinformation_inhalt4()))) &&
                ((this.zusatzinformation_art5 == null && other.getZusatzinformation_art5() == null) ||
                        (this.zusatzinformation_art5 != null &&
                                this.zusatzinformation_art5.equals(other.getZusatzinformation_art5()))) &&
                ((this.zusatzinformation_inhalt5 == null && other.getZusatzinformation_inhalt5() == null) ||
                        (this.zusatzinformation_inhalt5 != null &&
                                this.zusatzinformation_inhalt5.equals(other.getZusatzinformation_inhalt5()))) &&
                ((this.zusatzinformation_art6 == null && other.getZusatzinformation_art6() == null) ||
                        (this.zusatzinformation_art6 != null &&
                                this.zusatzinformation_art6.equals(other.getZusatzinformation_art6()))) &&
                ((this.zusatzinformation_inhalt6 == null && other.getZusatzinformation_inhalt6() == null) ||
                        (this.zusatzinformation_inhalt6 != null &&
                                this.zusatzinformation_inhalt6.equals(other.getZusatzinformation_inhalt6()))) &&
                ((this.zusatzinformation_art7 == null && other.getZusatzinformation_art7() == null) ||
                        (this.zusatzinformation_art7 != null &&
                                this.zusatzinformation_art7.equals(other.getZusatzinformation_art7()))) &&
                ((this.zusatzinformation_inhalt7 == null && other.getZusatzinformation_inhalt7() == null) ||
                        (this.zusatzinformation_inhalt7 != null &&
                                this.zusatzinformation_inhalt7.equals(other.getZusatzinformation_inhalt7()))) &&
                ((this.zusatzinformation_art8 == null && other.getZusatzinformation_art8() == null) ||
                        (this.zusatzinformation_art8 != null &&
                                this.zusatzinformation_art8.equals(other.getZusatzinformation_art8()))) &&
                ((this.zusatzinformation_inhalt8 == null && other.getZusatzinformation_inhalt8() == null) ||
                        (this.zusatzinformation_inhalt8 != null &&
                                this.zusatzinformation_inhalt8.equals(other.getZusatzinformation_inhalt8()))) &&
                ((this.zusatzinformation_art9 == null && other.getZusatzinformation_art9() == null) ||
                        (this.zusatzinformation_art9 != null &&
                                this.zusatzinformation_art9.equals(other.getZusatzinformation_art9()))) &&
                ((this.zusatzinformation_inhalt9 == null && other.getZusatzinformation_inhalt9() == null) ||
                        (this.zusatzinformation_inhalt9 != null &&
                                this.zusatzinformation_inhalt9.equals(other.getZusatzinformation_inhalt9()))) &&
                ((this.zusatzinformation_art10 == null && other.getZusatzinformation_art10() == null) ||
                        (this.zusatzinformation_art10 != null &&
                                this.zusatzinformation_art10.equals(other.getZusatzinformation_art10()))) &&
                ((this.zusatzinformation_inhalt10 == null && other.getZusatzinformation_inhalt10() == null) ||
                        (this.zusatzinformation_inhalt10 != null &&
                                this.zusatzinformation_inhalt10.equals(other.getZusatzinformation_inhalt10()))) &&
                ((this.zusatzinformation_art11 == null && other.getZusatzinformation_art11() == null) ||
                        (this.zusatzinformation_art11 != null &&
                                this.zusatzinformation_art11.equals(other.getZusatzinformation_art11()))) &&
                ((this.zusatzinformation_inhalt11 == null && other.getZusatzinformation_inhalt11() == null) ||
                        (this.zusatzinformation_inhalt11 != null &&
                                this.zusatzinformation_inhalt11.equals(other.getZusatzinformation_inhalt11()))) &&
                ((this.zusatzinformation_art12 == null && other.getZusatzinformation_art12() == null) ||
                        (this.zusatzinformation_art12 != null &&
                                this.zusatzinformation_art12.equals(other.getZusatzinformation_art12()))) &&
                ((this.zusatzinformation_inhalt12 == null && other.getZusatzinformation_inhalt12() == null) ||
                        (this.zusatzinformation_inhalt12 != null &&
                                this.zusatzinformation_inhalt12.equals(other.getZusatzinformation_inhalt12()))) &&
                ((this.zusatzinformation_art13 == null && other.getZusatzinformation_art13() == null) ||
                        (this.zusatzinformation_art13 != null &&
                                this.zusatzinformation_art13.equals(other.getZusatzinformation_art13()))) &&
                ((this.zusatzinformation_inhalt13 == null && other.getZusatzinformation_inhalt13() == null) ||
                        (this.zusatzinformation_inhalt13 != null &&
                                this.zusatzinformation_inhalt13.equals(other.getZusatzinformation_inhalt13()))) &&
                ((this.zusatzinformation_art14 == null && other.getZusatzinformation_art14() == null) ||
                        (this.zusatzinformation_art14 != null &&
                                this.zusatzinformation_art14.equals(other.getZusatzinformation_art14()))) &&
                ((this.zusatzinformation_inhalt14 == null && other.getZusatzinformation_inhalt14() == null) ||
                        (this.zusatzinformation_inhalt14 != null &&
                                this.zusatzinformation_inhalt14.equals(other.getZusatzinformation_inhalt14()))) &&
                ((this.zusatzinformation_art15 == null && other.getZusatzinformation_art15() == null) ||
                        (this.zusatzinformation_art15 != null &&
                                this.zusatzinformation_art15.equals(other.getZusatzinformation_art15()))) &&
                ((this.zusatzinformation_inhalt15 == null && other.getZusatzinformation_inhalt15() == null) ||
                        (this.zusatzinformation_inhalt15 != null &&
                                this.zusatzinformation_inhalt15.equals(other.getZusatzinformation_inhalt15()))) &&
                ((this.zusatzinformation_art16 == null && other.getZusatzinformation_art16() == null) ||
                        (this.zusatzinformation_art16 != null &&
                                this.zusatzinformation_art16.equals(other.getZusatzinformation_art16()))) &&
                ((this.zusatzinformation_inhalt16 == null && other.getZusatzinformation_inhalt16() == null) ||
                        (this.zusatzinformation_inhalt16 != null &&
                                this.zusatzinformation_inhalt16.equals(other.getZusatzinformation_inhalt16()))) &&
                ((this.zusatzinformation_art17 == null && other.getZusatzinformation_art17() == null) ||
                        (this.zusatzinformation_art17 != null &&
                                this.zusatzinformation_art17.equals(other.getZusatzinformation_art17()))) &&
                ((this.zusatzinformation_inhalt17 == null && other.getZusatzinformation_inhalt17() == null) ||
                        (this.zusatzinformation_inhalt17 != null &&
                                this.zusatzinformation_inhalt17.equals(other.getZusatzinformation_inhalt17()))) &&
                ((this.zusatzinformation_art18 == null && other.getZusatzinformation_art18() == null) ||
                        (this.zusatzinformation_art18 != null &&
                                this.zusatzinformation_art18.equals(other.getZusatzinformation_art18()))) &&
                ((this.zusatzinformation_inhalt18 == null && other.getZusatzinformation_inhalt18() == null) ||
                        (this.zusatzinformation_inhalt18 != null &&
                                this.zusatzinformation_inhalt18.equals(other.getZusatzinformation_inhalt18()))) &&
                ((this.zusatzinformation_art19 == null && other.getZusatzinformation_art19() == null) ||
                        (this.zusatzinformation_art19 != null &&
                                this.zusatzinformation_art19.equals(other.getZusatzinformation_art19()))) &&
                ((this.zusatzinformation_inhalt19 == null && other.getZusatzinformation_inhalt19() == null) ||
                        (this.zusatzinformation_inhalt19 != null &&
                                this.zusatzinformation_inhalt19.equals(other.getZusatzinformation_inhalt19()))) &&
                ((this.zusatzinformation_art20 == null && other.getZusatzinformation_art20() == null) ||
                        (this.zusatzinformation_art20 != null &&
                                this.zusatzinformation_art20.equals(other.getZusatzinformation_art20()))) &&
                ((this.zusatzinformation_inhalt20 == null && other.getZusatzinformation_inhalt20() == null) ||
                        (this.zusatzinformation_inhalt20 != null &&
                                this.zusatzinformation_inhalt20.equals(other.getZusatzinformation_inhalt20()))) &&
                ((this.stueck == null && other.getStueck() == null) ||
                        (this.stueck != null &&
                                this.stueck.equals(other.getStueck()))) &&
                ((this.gewicht == null && other.getGewicht() == null) ||
                        (this.gewicht != null &&
                                this.gewicht.equals(other.getGewicht()))) &&
                ((this.zahlweise == null && other.getZahlweise() == null) ||
                        (this.zahlweise != null &&
                                this.zahlweise.equals(other.getZahlweise()))) &&
                ((this.forderungsart == null && other.getForderungsart() == null) ||
                        (this.forderungsart != null &&
                                this.forderungsart.equals(other.getForderungsart()))) &&
                ((this.veranlagungsjahr == null && other.getVeranlagungsjahr() == null) ||
                        (this.veranlagungsjahr != null &&
                                this.veranlagungsjahr.equals(other.getVeranlagungsjahr()))) &&
                ((this.zugeordnete_faelligkeit == null && other.getZugeordnete_faelligkeit() == null) ||
                        (this.zugeordnete_faelligkeit != null &&
                                this.zugeordnete_faelligkeit.equals(other.getZugeordnete_faelligkeit()))) &&
                ((this.attributes == null && other.getAttributes() == null) ||
                        (this.attributes != null &&
                                java.util.Arrays.equals(this.attributes, other.getAttributes())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUmsatz() != null) {
            _hashCode += getUmsatz().hashCode();
        }
        if (getSoll_haben_kz() != null) {
            _hashCode += getSoll_haben_kz().hashCode();
        }
        if (getWkz_umsatz() != null) {
            _hashCode += getWkz_umsatz().hashCode();
        }
        if (getKurs() != null) {
            _hashCode += getKurs().hashCode();
        }
        if (getBasis_umsatz() != null) {
            _hashCode += getBasis_umsatz().hashCode();
        }
        if (getWkz_basis_umsatz() != null) {
            _hashCode += getWkz_basis_umsatz().hashCode();
        }
        if (getKonto() != null) {
            _hashCode += getKonto().hashCode();
        }
        if (getGegenkonto() != null) {
            _hashCode += getGegenkonto().hashCode();
        }
        if (getSteuerschluessel() != null) {
            _hashCode += getSteuerschluessel().hashCode();
        }
        if (getBelegdatum() != null) {
            _hashCode += getBelegdatum().hashCode();
        }
        if (getBelegfeld1() != null) {
            _hashCode += getBelegfeld1().hashCode();
        }
        if (getBelegfeld2() != null) {
            _hashCode += getBelegfeld2().hashCode();
        }
        if (getSkonto() != null) {
            _hashCode += getSkonto().hashCode();
        }
        if (getBuchungstext() != null) {
            _hashCode += getBuchungstext().hashCode();
        }
        if (getPostensperre() != null) {
            _hashCode += getPostensperre().hashCode();
        }
        if (getDiverse_adressNr() != null) {
            _hashCode += getDiverse_adressNr().hashCode();
        }
        if (getGeschaeftspartnerbank() != null) {
            _hashCode += getGeschaeftspartnerbank().hashCode();
        }
        if (getSachverhalt() != null) {
            _hashCode += getSachverhalt().hashCode();
        }
        if (getZinssperre() != null) {
            _hashCode += getZinssperre().hashCode();
        }
        if (getBeleglink() != null) {
            _hashCode += getBeleglink().hashCode();
        }
        if (getBeleginfo_art1() != null) {
            _hashCode += getBeleginfo_art1().hashCode();
        }
        if (getBeleginfo_inhalt1() != null) {
            _hashCode += getBeleginfo_inhalt1().hashCode();
        }
        if (getBeleginfo_art2() != null) {
            _hashCode += getBeleginfo_art2().hashCode();
        }
        if (getBeleginfo_inhalt2() != null) {
            _hashCode += getBeleginfo_inhalt2().hashCode();
        }
        if (getBeleginfo_art3() != null) {
            _hashCode += getBeleginfo_art3().hashCode();
        }
        if (getBeleginfo_inhalt3() != null) {
            _hashCode += getBeleginfo_inhalt3().hashCode();
        }
        if (getBeleginfo_art4() != null) {
            _hashCode += getBeleginfo_art4().hashCode();
        }
        if (getBeleginfo_inhalt4() != null) {
            _hashCode += getBeleginfo_inhalt4().hashCode();
        }
        if (getBeleginfo_art5() != null) {
            _hashCode += getBeleginfo_art5().hashCode();
        }
        if (getBeleginfo_inhalt5() != null) {
            _hashCode += getBeleginfo_inhalt5().hashCode();
        }
        if (getBeleginfo_art6() != null) {
            _hashCode += getBeleginfo_art6().hashCode();
        }
        if (getBeleginfo_inhalt6() != null) {
            _hashCode += getBeleginfo_inhalt6().hashCode();
        }
        if (getBeleginfo_art7() != null) {
            _hashCode += getBeleginfo_art7().hashCode();
        }
        if (getBeleginfo_inhalt7() != null) {
            _hashCode += getBeleginfo_inhalt7().hashCode();
        }
        if (getBeleginfo_art8() != null) {
            _hashCode += getBeleginfo_art8().hashCode();
        }
        if (getBeleginfo_inhalt8() != null) {
            _hashCode += getBeleginfo_inhalt8().hashCode();
        }
        if (getKost1() != null) {
            _hashCode += getKost1().hashCode();
        }
        if (getKost2() != null) {
            _hashCode += getKost2().hashCode();
        }
        if (getKost_menge() != null) {
            _hashCode += getKost_menge().hashCode();
        }
        if (getEuLand_UStID() != null) {
            _hashCode += getEuLand_UStID().hashCode();
        }
        if (getEu_steuersatz() != null) {
            _hashCode += getEu_steuersatz().hashCode();
        }
        if (getAbw_versteuerungsart() != null) {
            _hashCode += getAbw_versteuerungsart().hashCode();
        }
        if (getSachverhalt_LL() != null) {
            _hashCode += getSachverhalt_LL().hashCode();
        }
        if (getFunktionsergaenzung_LL() != null) {
            _hashCode += getFunktionsergaenzung_LL().hashCode();
        }
        if (getBu49_hauptfunktionstyp() != null) {
            _hashCode += getBu49_hauptfunktionstyp().hashCode();
        }
        if (getBu49_hauptfunktionsnummer() != null) {
            _hashCode += getBu49_hauptfunktionsnummer().hashCode();
        }
        if (getBu49_funktionsergaenzung() != null) {
            _hashCode += getBu49_funktionsergaenzung().hashCode();
        }
        if (getZusatzinformation_art1() != null) {
            _hashCode += getZusatzinformation_art1().hashCode();
        }
        if (getZusatzinformation_inhalt1() != null) {
            _hashCode += getZusatzinformation_inhalt1().hashCode();
        }
        if (getZusatzinformation_art2() != null) {
            _hashCode += getZusatzinformation_art2().hashCode();
        }
        if (getZusatzinformation_inhalt2() != null) {
            _hashCode += getZusatzinformation_inhalt2().hashCode();
        }
        if (getZusatzinformation_art3() != null) {
            _hashCode += getZusatzinformation_art3().hashCode();
        }
        if (getZusatzinformation_inhalt3() != null) {
            _hashCode += getZusatzinformation_inhalt3().hashCode();
        }
        if (getZusatzinformation_art4() != null) {
            _hashCode += getZusatzinformation_art4().hashCode();
        }
        if (getZusatzinformation_inhalt4() != null) {
            _hashCode += getZusatzinformation_inhalt4().hashCode();
        }
        if (getZusatzinformation_art5() != null) {
            _hashCode += getZusatzinformation_art5().hashCode();
        }
        if (getZusatzinformation_inhalt5() != null) {
            _hashCode += getZusatzinformation_inhalt5().hashCode();
        }
        if (getZusatzinformation_art6() != null) {
            _hashCode += getZusatzinformation_art6().hashCode();
        }
        if (getZusatzinformation_inhalt6() != null) {
            _hashCode += getZusatzinformation_inhalt6().hashCode();
        }
        if (getZusatzinformation_art7() != null) {
            _hashCode += getZusatzinformation_art7().hashCode();
        }
        if (getZusatzinformation_inhalt7() != null) {
            _hashCode += getZusatzinformation_inhalt7().hashCode();
        }
        if (getZusatzinformation_art8() != null) {
            _hashCode += getZusatzinformation_art8().hashCode();
        }
        if (getZusatzinformation_inhalt8() != null) {
            _hashCode += getZusatzinformation_inhalt8().hashCode();
        }
        if (getZusatzinformation_art9() != null) {
            _hashCode += getZusatzinformation_art9().hashCode();
        }
        if (getZusatzinformation_inhalt9() != null) {
            _hashCode += getZusatzinformation_inhalt9().hashCode();
        }
        if (getZusatzinformation_art10() != null) {
            _hashCode += getZusatzinformation_art10().hashCode();
        }
        if (getZusatzinformation_inhalt10() != null) {
            _hashCode += getZusatzinformation_inhalt10().hashCode();
        }
        if (getZusatzinformation_art11() != null) {
            _hashCode += getZusatzinformation_art11().hashCode();
        }
        if (getZusatzinformation_inhalt11() != null) {
            _hashCode += getZusatzinformation_inhalt11().hashCode();
        }
        if (getZusatzinformation_art12() != null) {
            _hashCode += getZusatzinformation_art12().hashCode();
        }
        if (getZusatzinformation_inhalt12() != null) {
            _hashCode += getZusatzinformation_inhalt12().hashCode();
        }
        if (getZusatzinformation_art13() != null) {
            _hashCode += getZusatzinformation_art13().hashCode();
        }
        if (getZusatzinformation_inhalt13() != null) {
            _hashCode += getZusatzinformation_inhalt13().hashCode();
        }
        if (getZusatzinformation_art14() != null) {
            _hashCode += getZusatzinformation_art14().hashCode();
        }
        if (getZusatzinformation_inhalt14() != null) {
            _hashCode += getZusatzinformation_inhalt14().hashCode();
        }
        if (getZusatzinformation_art15() != null) {
            _hashCode += getZusatzinformation_art15().hashCode();
        }
        if (getZusatzinformation_inhalt15() != null) {
            _hashCode += getZusatzinformation_inhalt15().hashCode();
        }
        if (getZusatzinformation_art16() != null) {
            _hashCode += getZusatzinformation_art16().hashCode();
        }
        if (getZusatzinformation_inhalt16() != null) {
            _hashCode += getZusatzinformation_inhalt16().hashCode();
        }
        if (getZusatzinformation_art17() != null) {
            _hashCode += getZusatzinformation_art17().hashCode();
        }
        if (getZusatzinformation_inhalt17() != null) {
            _hashCode += getZusatzinformation_inhalt17().hashCode();
        }
        if (getZusatzinformation_art18() != null) {
            _hashCode += getZusatzinformation_art18().hashCode();
        }
        if (getZusatzinformation_inhalt18() != null) {
            _hashCode += getZusatzinformation_inhalt18().hashCode();
        }
        if (getZusatzinformation_art19() != null) {
            _hashCode += getZusatzinformation_art19().hashCode();
        }
        if (getZusatzinformation_inhalt19() != null) {
            _hashCode += getZusatzinformation_inhalt19().hashCode();
        }
        if (getZusatzinformation_art20() != null) {
            _hashCode += getZusatzinformation_art20().hashCode();
        }
        if (getZusatzinformation_inhalt20() != null) {
            _hashCode += getZusatzinformation_inhalt20().hashCode();
        }
        if (getStueck() != null) {
            _hashCode += getStueck().hashCode();
        }
        if (getGewicht() != null) {
            _hashCode += getGewicht().hashCode();
        }
        if (getZahlweise() != null) {
            _hashCode += getZahlweise().hashCode();
        }
        if (getForderungsart() != null) {
            _hashCode += getForderungsart().hashCode();
        }
        if (getVeranlagungsjahr() != null) {
            _hashCode += getVeranlagungsjahr().hashCode();
        }
        if (getZugeordnete_faelligkeit() != null) {
            _hashCode += getZugeordnete_faelligkeit().hashCode();
        }
        if (getAttributes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
