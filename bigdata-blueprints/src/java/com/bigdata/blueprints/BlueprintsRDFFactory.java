/**
Copyright (C) SYSTAP, LLC 2006-2014.  All rights reserved.

Contact:
     SYSTAP, LLC
     4501 Tower Road
     Greensboro, NC 27410
     licenses@bigdata.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package com.bigdata.blueprints;

import org.openrdf.model.Literal;
import org.openrdf.model.URI;

import com.tinkerpop.blueprints.Element;

/**
 * Factory for converting blueprints data to RDF and back again. 
 * 
 * @author mikepersonick
 *
 */
public interface BlueprintsRDFFactory {

    /**
     * Create a vertex URI from a blueprints vertex id.
     */
	URI toVertexURI(Object key);

	/**
     * Create an edge URI from a blueprints edge id.
     */
	URI toEdgeURI(Object key);
	
    /**
     * Create an element URI from a blueprints element id.
     */
	URI toURI(Element e);
	
    /**
     * Create a property URI from a blueprints property name.
     */
	URI toPropertyURI(String property);
	
    /**
     * Create a blueprints vertex id from a vertex URI.
     */
	String fromVertexURI(URI uri);

    /**
     * Create a blueprints edge id from an edge URI.
     */
	String fromEdgeURI(URI uri);
	
    /**
     * Create a blueprints property name from a property URI.
     */
	String fromPropertyURI(URI uri);
	
	/**
	 * Create a datatyped literal from a blueprints property value.
	 */
	Literal toLiteral(Object val);
	
	/**
	 * Create a blueprints property value from a datatyped literal.
	 */
	Object fromLiteral(Literal lit);
	
}
