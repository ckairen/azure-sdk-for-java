// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlWriter;
import javax.xml.stream.XMLStreamException;

/**
 * The RuleFilter model.
 */
@Immutable
public class RuleFilterImpl implements XmlSerializable<RuleFilterImpl> {
    private static final String SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT
        = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect";

    private static final String WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE
        = "http://www.w3.org/2001/XMLSchema-instance";

    /**
     * Creates an instance of RuleFilter class.
     */
    public RuleFilterImpl() {
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Filter" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeNamespace(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT);
        xmlWriter.writeNamespace("xsi", WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE);
        xmlWriter.writeStringAttribute(WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE, "type", "RuleFilter");
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of RuleFilter from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of RuleFilter if the XmlReader was pointing to an instance of it, or null if it was pointing
     * to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing the polymorphic discriminator.
     * @throws XMLStreamException If an error occurs while reading the RuleFilter.
     */
    public static RuleFilterImpl fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of RuleFilter from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of RuleFilter if the XmlReader was pointing to an instance of it, or null if it was pointing
     * to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing the polymorphic discriminator.
     * @throws XMLStreamException If an error occurs while reading the RuleFilter.
     */
    public static RuleFilterImpl fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Filter" : rootElementName;
        return xmlReader.readObject(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT, finalRootElementName, reader -> {
            // Get the XML discriminator attribute.
            String discriminatorValue
                = reader.getStringAttribute(WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE, "type");
            // Use the discriminator value to determine which subtype should be deserialized.
            if ("CorrelationFilter".equals(discriminatorValue)) {
                return CorrelationFilterImpl.fromXml(reader, finalRootElementName);
            } else if ("SqlFilter".equals(discriminatorValue)) {
                return SqlFilterImpl.fromXmlKnownDiscriminator(reader, finalRootElementName);
            } else if ("TrueFilter".equals(discriminatorValue)) {
                return TrueFilterImpl.fromXml(reader, finalRootElementName);
            } else if ("FalseFilter".equals(discriminatorValue)) {
                return FalseFilterImpl.fromXml(reader, finalRootElementName);
            } else {
                throw new IllegalStateException(
                    "Discriminator field 'type' didn't match one of the expected values 'CorrelationFilter', 'SqlFilter', 'TrueFilter', or 'FalseFilter'. It was: '"
                        + discriminatorValue + "'.");
            }
        });
    }
}
