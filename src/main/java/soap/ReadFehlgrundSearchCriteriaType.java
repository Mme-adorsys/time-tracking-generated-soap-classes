/**
 * ReadFehlgrundSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zur Abfrage von Fehlgründen.
 */
public class ReadFehlgrundSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadFehlgrundSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFehlgrundSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurzform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurzform"));
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
    }

    /* Die Kurzbezeichnung des gesuchten Fehlgrundes. */
    private String kurzform;
    /* Suche nach der Genehmigungspflicht einschränken. */
    private Boolean genehmigungspflichtig;
    /* Suche nach der Möglichkeit der Erfassung durch den Mitarbeiter
     * einschränken. */
    private Boolean selbstErfassen;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadFehlgrundSearchCriteriaType() {
    }


    public ReadFehlgrundSearchCriteriaType(
            String kurzform,
            Boolean genehmigungspflichtig,
            Boolean selbstErfassen) {
        this.kurzform = kurzform;
        this.genehmigungspflichtig = genehmigungspflichtig;
        this.selbstErfassen = selbstErfassen;
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
     * Gets the kurzform value for this ReadFehlgrundSearchCriteriaType.
     *
     * @return kurzform   * Die Kurzbezeichnung des gesuchten Fehlgrundes.
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Sets the kurzform value for this ReadFehlgrundSearchCriteriaType.
     *
     * @param kurzform   * Die Kurzbezeichnung des gesuchten Fehlgrundes.
     */
    public void setKurzform(String kurzform) {
        this.kurzform = kurzform;
    }

    /**
     * Gets the genehmigungspflichtig value for this ReadFehlgrundSearchCriteriaType.
     *
     * @return genehmigungspflichtig   * Suche nach der Genehmigungspflicht einschränken.
     */
    public Boolean getGenehmigungspflichtig() {
        return genehmigungspflichtig;
    }

    /**
     * Sets the genehmigungspflichtig value for this ReadFehlgrundSearchCriteriaType.
     *
     * @param genehmigungspflichtig   * Suche nach der Genehmigungspflicht einschränken.
     */
    public void setGenehmigungspflichtig(Boolean genehmigungspflichtig) {
        this.genehmigungspflichtig = genehmigungspflichtig;
    }

    /**
     * Gets the selbstErfassen value for this ReadFehlgrundSearchCriteriaType.
     *
     * @return selbstErfassen   * Suche nach der Möglichkeit der Erfassung durch den Mitarbeiter
     * einschränken.
     */
    public Boolean getSelbstErfassen() {
        return selbstErfassen;
    }

    /**
     * Sets the selbstErfassen value for this ReadFehlgrundSearchCriteriaType.
     *
     * @param selbstErfassen   * Suche nach der Möglichkeit der Erfassung durch den Mitarbeiter
     * einschränken.
     */
    public void setSelbstErfassen(Boolean selbstErfassen) {
        this.selbstErfassen = selbstErfassen;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadFehlgrundSearchCriteriaType)) return false;
        ReadFehlgrundSearchCriteriaType other = (ReadFehlgrundSearchCriteriaType) obj;
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
                ((this.genehmigungspflichtig == null && other.getGenehmigungspflichtig() == null) ||
                        (this.genehmigungspflichtig != null &&
                                this.genehmigungspflichtig.equals(other.getGenehmigungspflichtig()))) &&
                ((this.selbstErfassen == null && other.getSelbstErfassen() == null) ||
                        (this.selbstErfassen != null &&
                                this.selbstErfassen.equals(other.getSelbstErfassen())));
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
        if (getGenehmigungspflichtig() != null) {
            _hashCode += getGenehmigungspflichtig().hashCode();
        }
        if (getSelbstErfassen() != null) {
            _hashCode += getSelbstErfassen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
