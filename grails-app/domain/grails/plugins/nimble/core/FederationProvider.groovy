/*
 *  Nimble, an extensive application base for Grails
 *  Copyright (C) 2010 Bradley Beddoes
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package grails.plugins.nimble.core

import grails.util.Holders

/**
 * Represents a remote party that provides federated authentication
 *
 * @author Bradley Beddoes
 */
class FederationProvider {

  String uid
  Details details
  boolean autoProvision
  
  Map props

  static mapping = {
	datasource 'ALL'
      table Holders.getConfig().nimble.tablenames.federationprovider
      uid column: Holders.getConfig().nimble.fieldnames.uid
  }

  static constraints = {
    uid(nullable:false)
    details(nullable:false)
    props(nullable: true)
  }

}


