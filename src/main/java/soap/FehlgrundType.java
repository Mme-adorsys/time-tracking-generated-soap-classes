/**
 * FehlgrundType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter eines Fehlgrunds
 */
public class FehlgrundType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FehlgrundType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FehlgrundType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurzform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurzform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genehmigungspflichtig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genehmigungspflichtig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selbstErfassen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selbstErfassen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fehldauer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fehldauer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FehldauerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Kurzbezeichnung des Fehlgrundes */
    private String kurzform;
    /* Die Bezeichnung des Fehlgrundes */
    private String bezeichnung;
    /* Kennung, ob Fehlzeiten mit diesem Fehlgrund genehmigungspflichtig
     * sind */
    private Boolean genehmigungspflichtig;
    /* Kennung, ob ein Benutzer Fehlzeiten mit diesem Fehlgrund selbst
     * erfassen darf */
    private Boolean selbstErfassen;
    private FehldauerType fehldauer;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public FehlgrundType() {
    }


    public FehlgrundType(
            String kurzform,
            String bezeichnung,
            Boolean genehmigungspflichtig,
            Boolean selbstErfassen,
            FehldauerType fehldauer) {
        this.kurzform = kurzform;
        this.bezeichnung = bezeichnung;
        this.genehmigungspflichtig = genehmigungspflichtig;
        this.selbstErfassen = selbstErfassen;
        this.fehldauer = fehldauer;
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
     * Gets the kurzform value for this FehlgrundType.
     *
     * @return kurzform   * Die Kurzbezeichnung des Fehlgrundes
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Sets the kurzform value for this FehlgrundType.
     *
     * @param kurzform   * Die Kurzbezeichnung des Fehlgrundes
     */
    public void setKurzform(String kurzform) {
        this.kurzform = kurzform;
    }

    /**
     * Gets the bezeichnung value for this FehlgrundType.
     *
     * @return bezeichnung   * Die Bezeichnung des Fehlgrundes
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this FehlgrundType.
     *
     * @param bezeichnung   * Die Bezeichnung des Fehlgrundes
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the genehmigungspflichtig value for this FehlgrundType.
     *
     * @return genehmigungspflichtig   * Kennung, ob Fehlzeiten mit diesem Fehlgrund genehmigungspflichtig
     * sind
     */
    public Boolean getGenehmigungspflichtig() {
        return genehmigungspflichtig;
    }

    /**
     * Sets the genehmigungspflichtig value for this FehlgrundType.
     *
     * @param genehmigungspflichtig   * Kennung, ob Fehlzeiten mit diesem Fehlgrund genehmigungspflichtig
     * sind
     */
    public void setGenehmigungspflichtig(Boolean genehmigungspflichtig) {
        this.genehmigungspflichtig = genehmigungspflichtig;
    }

    /**
     * Gets the selbstErfassen value for this FehlgrundType.
     *
     * @return selbstErfassen   * Kennung, ob ein Benutzer Fehlzeiten mit diesem Fehlgrund selbst
     * erfassen darf
     */
    public Boolean getSelbstErfassen() {
        return selbstErfassen;
    }

    /**
     * Sets the selbstErfassen value for this FehlgrundType.
     *
     * @param selbstErfassen   * Kennung, ob ein Benutzer Fehlzeiten mit diesem Fehlgrund selbst
     * erfassen darf
     */
    public void setSelbstErfassen(Boolean selbstErfassen) {
        this.selbstErfassen = selbstErfassen;
    }

    /**
     * Gets the fehldauer value for this FehlgrundType.
     *
     * @return fehldauer
     */
    public FehldauerType getFehldauer() {
        return fehldauer;
    }

    /**
     * Sets the fehldauer value for this FehlgrundType.
     *
     * @param fehldauer
     */
    public void setFehldauer(FehldauerType fehldauer) {
        this.fehldauer = fehldauer;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FehlgrundType)) return false;
        FehlgrundType other = (FehlgrundType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.kurzform == null && other.getKurzform() == null) ||
                        (this.kurzform != null &&
                                this.kurzform.equals(other.getKurzform()))) &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
                ((this.genehmigungspflichtig == null && other.getGenehmigungspflichtig() == null) ||
                        (this.genehmigungspflichtig != null &&
                                this.genehmigungspflichtig.equals(other.getGenehmigungspflichtig()))) &&
                ((this.selbstErfassen == null && other.getSelbstErfassen() == null) ||
                        (this.selbstErfassen != null &&
                                this.selbstErfassen.equals(other.getSelbstErfassen()))) &&
                ((this.fehldauer == null && other.getFehldauer() == null) ||
                        (this.fehldauer != null &&
                                this.fehldauer.equals(other.getFehldauer())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getKurzform() != null) {
            _hashCode += getKurzform().hashCode();
        }
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        if (getGenehmigungspflichtig() != null) {
            _hashCode += getGenehmigungspflichtig().hashCode();
        }
        if (getSelbstErfassen() != null) {
            _hashCode += getSelbstErfassen().hashCode();
        }
        if (getFehldauer() != null) {
            _hashCode += getFehldauer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
