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

import org.apache.maven.shared.verifier.util.ResourceExtractor;
import org.apache.maven.shared.verifier.Verifier;

import java.io.File;

import org.junit.jupiter.api.Test;

public class MavenIT0056MultipleGoalExecutionsTest
    extends AbstractMavenIntegrationTestCase
{
    public MavenIT0056MultipleGoalExecutionsTest()
    {
        super( ALL_MAVEN_VERSIONS );
    }

    /**
     * Test that multiple executions of a goal with different
     * parameter values will succeed.
     *
     * @throws Exception in case of failure
     */
    @Test
    public void testit0056()
        throws Exception
    {
        File testDir = ResourceExtractor.simpleExtractResources( getClass(), "/it0056" );

        Verifier verifier = newVerifier( testDir.getAbsolutePath() );
        verifier.setAutoclean( false );
        verifier.deleteDirectory( "target" );
        verifier.executeGoal( "initialize" );
        verifier.verifyErrorFreeLog();

        verifier.verifyFilePresent( "target/first-exec.txt" );
        verifier.verifyFilePresent( "target/second-exec.txt" );
    }

}
