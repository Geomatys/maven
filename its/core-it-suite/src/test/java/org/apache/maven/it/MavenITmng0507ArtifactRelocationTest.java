package org.apache.maven.it;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.it.Verifier;
import org.apache.maven.it.util.ResourceExtractor;

import java.io.File;
import java.util.List;

/**
 * This is a test set for <a href="http://jira.codehaus.org/browse/MNG-507">MNG-507</a>.
 * 
 * @author Brett Porter
 * @version $Id$
 */
public class MavenITmng0507ArtifactRelocationTest
    extends AbstractMavenIntegrationTestCase
{
    public MavenITmng0507ArtifactRelocationTest()
    {
        super( ALL_MAVEN_VERSIONS );
    }

    /**
     * Test artifact relocation.
     */
    public void testitMNG507()
        throws Exception
    {
        File testDir = ResourceExtractor.simpleExtractResources( getClass(), "/mng-0507" );

        Verifier verifier = new Verifier( testDir.getAbsolutePath() );
        verifier.setAutoclean( false );
        verifier.deleteDirectory( "target" );
        verifier.deleteArtifact( "org.apache.maven", "maven-core-it-support", "1.1", "jar" );
        verifier.deleteArtifact( "org.apache.maven", "maven-core-it-support", "1.1", "pom" );
        verifier.deleteArtifact( "org.apache.maven", "maven-core-it-support-old-location", "1.1", "jar" );
        verifier.deleteArtifact( "org.apache.maven", "maven-core-it-support-old-location", "1.1", "pom" );
        verifier.executeGoal( "validate" );
        verifier.verifyErrorFreeLog();
        verifier.resetStreams();

        verifier.assertArtifactPresent( "org.apache.maven", "maven-core-it-support", "1.1", "jar" );
        verifier.assertArtifactPresent( "org.apache.maven", "maven-core-it-support", "1.1", "pom" );
        verifier.assertArtifactPresent( "org.apache.maven", "maven-core-it-support-old-location", "1.1", "pom" );
        verifier.assertArtifactNotPresent( "org.apache.maven", "maven-core-it-support-old-location", "1.1", "jar" );

        List artifacts = verifier.loadLines( "target/artifacts.txt", "UTF-8" );
        assertTrue( artifacts.toString(), artifacts.contains( "org.apache.maven:maven-core-it-support:jar:1.1" ) );
    }

}
