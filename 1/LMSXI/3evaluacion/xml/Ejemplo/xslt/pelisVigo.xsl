﻿<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  <html>
  <head>
    <meta charset="UTF-8"/>
   <link rel="stylesheet" type="text/css" href="tabla.css"/>
  
  </head>
  
    <body>
    
    <!--Al poner el / en match selecciona todos los elementos del xml-->
    <!--si saca todo ir a firefox poner en el buscador: about:config      busca security.fileuri.strict_origin_policy y cambiarlo a false  -->
    <h1>Ejemplo 1</h1>
    <xsl:for-each select="//pelicula">
    <p><b>Titulo:</b> <xsl:value-of select="titulo"/></p>
    </xsl:for-each>
    
    <h1>Ejemplo 2</h1>
    <xsl:for-each select="//pelicula">
      <xsl:sort select="titulo"/>
      <p><b>Titulo:</b> <xsl:value-of select="titulo"/></p>
    </xsl:for-each>
    
    <h1>Ejemplo 3</h1>
    <xsl:for-each select="//pelicula">
      <xsl:sort select="actor[1]"/>
      <p><b>Titulo:</b> <xsl:value-of select="titulo"/></p>
    </xsl:for-each>
    
    <h1>Ejemplo 4</h1>
    <xsl:for-each select="//pelicula">
      <xsl:sort select="titulo" order="descending"/>
      <p><b>Titulo:</b> <xsl:value-of select="titulo"/></p>
    </xsl:for-each>
    
    <h1>Ejemplo 5</h1>
    
    <h1>Ejemplo 6</h1>
    <xsl:for-each select="//pelicula">
      <xsl:sort select="actor[2]"/>
      <p><xsl:value-of select="actor[2]"/></p>
    </xsl:for-each>
    
    <h1>Ejemplo 7</h1>
    <xsl:for-each select="//pelicula[director='Fernando León']">
      <p><b>Titulo:</b> <xsl:value-of select="titulo"/></p>
    </xsl:for-each>
    
    <h1>Ejemplo 8</h1>
    <xsl:for-each select="//pelicula[director!='Fernando León']">
      <p><b>Titulo:</b> <xsl:value-of select="titulo"/><br></br>
      <blockquote>
      <xsl:value-of select="actor[1]"/><br></br>
      <xsl:value-of select="actor[2]"/>
      </blockquote>
      </p>
    </xsl:for-each>
    
    <h1>Ejemplo 9</h1>
    <xsl:for-each select="//pelicula">
    <xsl:if test="director!='Fernando León'">
      <p><b>Titulo:</b> <xsl:value-of select="titulo"/><br></br>
      <blockquote>
      <xsl:value-of select="actor[1]"/><br></br>
      <xsl:value-of select="actor[2]"/>
      </blockquote>
      </p>
      </xsl:if>
    </xsl:for-each>
    
    <h1>Ejemplo 10</h1>
    <xsl:for-each select="//pelicula">
      <xsl:choose>
        <xsl:when test="titulo='Los lunes al sol'">
        <p>L</p>
        </xsl:when>
        
        <xsl:when test="titulo='Toro'">
          <p>I</p>
        </xsl:when>
        
        <xsl:otherwise>
          <p>Otro</p>
        </xsl:otherwise>
        
      </xsl:choose>
    </xsl:for-each>
    
    <h1>Listado películas</h1>
    <ul style="list-style:square">
    <xsl:for-each select="//pelicula">
      <li><xsl:value-of select="titulo"/></li>
    </xsl:for-each>
    </ul>
    
    <h1 id="tabla">Tabla</h1>
    <table>
    <tr><th>PELICULA</th><th>DIRECTOR</th></tr>
      <xsl:for-each select="//pelicula">
        <tr><td><xsl:value-of select="titulo"/></td><td><xsl:value-of select="director" /></td></tr>
      </xsl:for-each>
    </table>
    
    </body>
  </html>
  </xsl:template>
</xsl:stylesheet>
