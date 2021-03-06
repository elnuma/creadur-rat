<?xml version='1.0' ?>
<!--
 Licensed to the Apache Software Foundation (ASF) under one   *
 or more contributor license agreements.  See the NOTICE file *
 distributed with this work for additional information        *
 regarding copyright ownership.  The ASF licenses this file   *
 to you under the Apache License, Version 2.0 (the            *
 "License"); you may not use this file except in compliance   *
 with the License.  You may obtain a copy of the License at   *
                                                              *
   http://www.apache.org/licenses/LICENSE-2.0                 *
                                                              *
 Unless required by applicable law or agreed to in writing,   *
 software distributed under the License is distributed on an  *
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 KIND, either express or implied.  See the License for the    *
 specific language governing permissions and limitations      *
 under the License.                                           *
-->
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method='text'/>
<xsl:template match='/'>
*****************************************************
Summary
-------
Notes: <xsl:value-of select='count(descendant::type[attribute::name="notice"])'/>
Binaries: <xsl:value-of select='count(descendant::type[attribute::name="binary"])'/>
Archives: <xsl:value-of select='count(descendant::type[attribute::name="archive"])'/>
Standards: <xsl:value-of select='count(descendant::type[attribute::name="standard"])'/>

Apache Licensed: <xsl:value-of select='count(descendant::header-type[attribute::name="AL   "])'/>
Generated Documents: <xsl:value-of select='count(descendant::header-type[attribute::name="GEN  "])'/>

JavaDocs are generated and so license header is optional
Generated files do not required license headers

<xsl:value-of select='count(descendant::header-type[attribute::name="?????"])'/> Unknown Licenses

*******************************

Archives (+ indicates readable, $ unreadable): 

 <xsl:for-each select='descendant::resource[type/@name="archive"]'>
 <xsl:choose><xsl:when test='archive-type/@name="readable"'>+ </xsl:when><xsl:otherwise>$ </xsl:otherwise></xsl:choose><xsl:value-of select='@name'/>
 <xsl:text>
 </xsl:text>
 </xsl:for-each>
*****************************************************
  Files with AL headers will be marked L
  Binary files (which do not require AL headers) will be marked B
  Compressed archives will be marked A
  Notices, licenses etc will be marked N
 <xsl:for-each select='descendant::resource'>
  <xsl:choose>
	 <xsl:when test='license-approval/@name="false"'>!</xsl:when>
	 <xsl:otherwise><xsl:text> </xsl:text></xsl:otherwise>
 </xsl:choose>
 <xsl:choose>
	 <xsl:when test='type/@name="notice"'>N    </xsl:when>
	 <xsl:when test='type/@name="archive"'>A    </xsl:when>
	 <xsl:when test='type/@name="binary"'>B    </xsl:when>
	 <xsl:when test='type/@name="standard"'><xsl:value-of select='header-type/@name'/></xsl:when>
	 <xsl:otherwise>!!!!!</xsl:otherwise>
 </xsl:choose>
 <xsl:text> </xsl:text>
 <xsl:value-of select='@name'/>
 <xsl:text>
 </xsl:text>
 </xsl:for-each>
 *****************************************************
 Printing headers for files without AL header...
 
 <xsl:for-each select='descendant::resource[header-type/@name="?????"]'>
 =======================================================================
 ==<xsl:value-of select='@name'/>
 =======================================================================
<xsl:value-of select='header-sample'/>
</xsl:for-each>
</xsl:template>
</xsl:stylesheet>