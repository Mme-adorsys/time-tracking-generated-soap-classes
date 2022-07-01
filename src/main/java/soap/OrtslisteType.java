/**
 * OrtslisteType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class OrtslisteType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(OrtslisteType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "OrtslisteType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gueltigAb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gueltigAb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gueltigBis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gueltigBis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "OrtType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    private Integer id;
    private String gueltigAb;
    private String gueltigBis;
    private String bemerkung;
    private OrtType[] ort;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public OrtslisteType() {
    }


    public OrtslisteType(
            Integer id,
            String gueltigAb,
            String gueltigBis,
            String bemerkung,
            OrtType[] ort) {
        this.id = id;
        this.gueltigAb = gueltigAb;
        this.gueltigBis = gueltigBis;
        this.bemerkung = bemerkung;
        this.ort = ort;
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
     * Gets the id value for this OrtslisteType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this OrtslisteType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the gueltigAb value for this OrtslisteType.
     *
     * @return gueltigAb
     */
    public String getGueltigAb() {
        return gueltigAb;
    }

    /**
     * Sets the gueltigAb value for this OrtslisteType.
     *
     * @param gueltigAb
     */
    public void setGueltigAb(String gueltigAb) {
        this.gueltigAb = gueltigAb;
    }

    /**
     * Gets the gueltigBis value for this OrtslisteType.
     *
     * @return gueltigBis
     */
    public String getGueltigBis() {
        return gueltigBis;
    }

    /**
     * Sets the gueltigBis value for this OrtslisteType.
     *
     * @param gueltigBis
     */
    public void setGueltigBis(String gueltigBis) {
        this.gueltigBis = gueltigBis;
    }

    /**
     * Gets the bemerkung value for this OrtslisteType.
     *
     * @return bemerkung
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this OrtslisteType.
     *
     * @param bemerkung
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the ort value for this OrtslisteType.
     *
     * @return ort
     */
    public OrtType[] getOrt() {
        return ort;
    }

    /**
     * Sets the ort value for this OrtslisteType.
     *
     * @param ort
     */
    public void setOrt(OrtType[] ort) {
        this.ort = ort;
    }

    public OrtType getOrt(int i) {
        return this.ort[i];
    }

    public void setOrt(int i, OrtType _value) {
        this.ort[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrtslisteType)) return false;
        OrtslisteType other = (OrtslisteType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.gueltigAb == null && other.getGueltigAb() == null) ||
                        (this.gueltigAb != null &&
                                this.gueltigAb.equals(other.getGueltigAb()))) &&
                ((this.gueltigBis == null && other.getGueltigBis() == null) ||
                        (this.gueltigBis != null &&
                                this.gueltigBis.equals(other.getGueltigBis()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.ort == null && other.getOrt() == null) ||
                        (this.ort != null &&
                                java.util.Arrays.equals(this.ort, other.getOrt())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getGueltigAb() != null) {
            _hashCode += getGueltigAb().hashCode();
        }
        if (getGueltigBis() != null) {
            _hashCode += getGueltigBis().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getOrt() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getOrt());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOrt(), i);
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
