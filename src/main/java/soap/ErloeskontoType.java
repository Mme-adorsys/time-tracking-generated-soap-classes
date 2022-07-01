/**
 * ErloeskontoType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Erlöskontos
 */
public class ErloeskontoType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ErloeskontoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ErloeskontoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erloeskontoNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erloeskontoNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("landkennung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "landkennung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mwst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mwst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Nummer des Erlöskontos. */
    private String erloeskontoNr;
    /* Die Bezeichnung des Erlöskontos. */
    private String bezeichnung;
    /* Die Kennung für das Land, z.B. 'Inland', 'EU', 'Drittland' */
    private String landkennung;
    /* Der MwSt-Satz des Erlöskontos. */
    private Double mwst;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ErloeskontoType() {
    }


    public ErloeskontoType(
            String erloeskontoNr,
            String bezeichnung,
            String landkennung,
            Double mwst) {
        this.erloeskontoNr = erloeskontoNr;
        this.bezeichnung = bezeichnung;
        this.landkennung = landkennung;
        this.mwst = mwst;
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
     * Gets the erloeskontoNr value for this ErloeskontoType.
     *
     * @return erloeskontoNr   * Die Nummer des Erlöskontos.
     */
    public String getErloeskontoNr() {
        return erloeskontoNr;
    }

    /**
     * Sets the erloeskontoNr value for this ErloeskontoType.
     *
     * @param erloeskontoNr   * Die Nummer des Erlöskontos.
     */
    public void setErloeskontoNr(String erloeskontoNr) {
        this.erloeskontoNr = erloeskontoNr;
    }

    /**
     * Gets the bezeichnung value for this ErloeskontoType.
     *
     * @return bezeichnung   * Die Bezeichnung des Erlöskontos.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this ErloeskontoType.
     *
     * @param bezeichnung   * Die Bezeichnung des Erlöskontos.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the landkennung value for this ErloeskontoType.
     *
     * @return landkennung   * Die Kennung für das Land, z.B. 'Inland', 'EU', 'Drittland'
     */
    public String getLandkennung() {
        return landkennung;
    }

    /**
     * Sets the landkennung value for this ErloeskontoType.
     *
     * @param landkennung   * Die Kennung für das Land, z.B. 'Inland', 'EU', 'Drittland'
     */
    public void setLandkennung(String landkennung) {
        this.landkennung = landkennung;
    }

    /**
     * Gets the mwst value for this ErloeskontoType.
     *
     * @return mwst   * Der MwSt-Satz des Erlöskontos.
     */
    public Double getMwst() {
        return mwst;
    }

    /**
     * Sets the mwst value for this ErloeskontoType.
     *
     * @param mwst   * Der MwSt-Satz des Erlöskontos.
     */
    public void setMwst(Double mwst) {
        this.mwst = mwst;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ErloeskontoType)) return false;
        ErloeskontoType other = (ErloeskontoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.erloeskontoNr == null && other.getErloeskontoNr() == null) ||
                        (this.erloeskontoNr != null &&
                                this.erloeskontoNr.equals(other.getErloeskontoNr()))) &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
                ((this.landkennung == null && other.getLandkennung() == null) ||
                        (this.landkennung != null &&
                                this.landkennung.equals(other.getLandkennung()))) &&
                ((this.mwst == null && other.getMwst() == null) ||
                        (this.mwst != null &&
                                this.mwst.equals(other.getMwst())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getErloeskontoNr() != null) {
            _hashCode += getErloeskontoNr().hashCode();
        }
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        if (getLandkennung() != null) {
            _hashCode += getLandkennung().hashCode();
        }
        if (getMwst() != null) {
            _hashCode += getMwst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
