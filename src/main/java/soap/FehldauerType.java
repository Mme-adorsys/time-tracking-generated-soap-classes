/**
 * FehldauerType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Dauer einer Fehlzeit.
 */
public class FehldauerType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FehldauerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FehldauerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ganzerTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ganzerTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("halberTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "halberTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private Boolean ganzerTag;
    private Boolean halberTag;
    private Boolean stunden;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public FehldauerType() {
    }


    public FehldauerType(
            Boolean ganzerTag,
            Boolean halberTag,
            Boolean stunden) {
        this.ganzerTag = ganzerTag;
        this.halberTag = halberTag;
        this.stunden = stunden;
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
     * Gets the ganzerTag value for this FehldauerType.
     *
     * @return ganzerTag
     */
    public Boolean getGanzerTag() {
        return ganzerTag;
    }

    /**
     * Sets the ganzerTag value for this FehldauerType.
     *
     * @param ganzerTag
     */
    public void setGanzerTag(Boolean ganzerTag) {
        this.ganzerTag = ganzerTag;
    }

    /**
     * Gets the halberTag value for this FehldauerType.
     *
     * @return halberTag
     */
    public Boolean getHalberTag() {
        return halberTag;
    }

    /**
     * Sets the halberTag value for this FehldauerType.
     *
     * @param halberTag
     */
    public void setHalberTag(Boolean halberTag) {
        this.halberTag = halberTag;
    }

    /**
     * Gets the stunden value for this FehldauerType.
     *
     * @return stunden
     */
    public Boolean getStunden() {
        return stunden;
    }

    /**
     * Sets the stunden value for this FehldauerType.
     *
     * @param stunden
     */
    public void setStunden(Boolean stunden) {
        this.stunden = stunden;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FehldauerType)) return false;
        FehldauerType other = (FehldauerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.ganzerTag == null && other.getGanzerTag() == null) ||
                        (this.ganzerTag != null &&
                                this.ganzerTag.equals(other.getGanzerTag()))) &&
                ((this.halberTag == null && other.getHalberTag() == null) ||
                        (this.halberTag != null &&
                                this.halberTag.equals(other.getHalberTag()))) &&
                ((this.stunden == null && other.getStunden() == null) ||
                        (this.stunden != null &&
                                this.stunden.equals(other.getStunden())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGanzerTag() != null) {
            _hashCode += getGanzerTag().hashCode();
        }
        if (getHalberTag() != null) {
            _hashCode += getHalberTag().hashCode();
        }
        if (getStunden() != null) {
            _hashCode += getStunden().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
