/*
 *  Nimble, an extensive application base for Grails
 *  Copyright (C) 2009 Intient Pty Ltd
 *
 *  Open Source Use - GNU Affero General Public License, version 3
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  Commercial/Private Use
 *
 *  You may purchase a commercial version of this software which
 *  frees you from all restrictions of the AGPL by visiting
 *  http://intient.com/products/nimble/licenses
 *
 *  If you have purchased a commercial version of this software it is licensed
 *  to you under the terms of your agreement made with Intient Pty Ltd.
 */
package intient.nimble.domain

/**
 * Represents a web based url with extended information for display purposes.
 * A Url object does not belong to any parent object as its use is general in nature,
 * developers are advised they are responsible for saving and deleting this object. Grails
 * will not automatically do this for you.
 *
 * @author Bradley Beddoes
 */
class Url {

    String name
    String description

    String location
    String altText
    Language lang

    static belongsTo = [Details, Feed, Profile, SocialMediaAccount, SocialMediaService, Status]

    static constraints = {
        name(nullable: true, blank:false)
        description(nullable: true, blank:false)
        location(nullable: false, blank: false, url: true)
        altText(nullable: true, blank: false)
        lang(nullable: true)
    }
}
