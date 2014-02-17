/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.was.generator.plains.grass;

import org.terasology.anotherWorld.coreBiome.PlainsBiome;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.gf.PlantType;
import org.terasology.gf.generator.StaticBlockFloraSpawnDefinition;
import org.terasology.was.generator.Blocks;
import org.terasology.world.block.BlockUri;
import org.terasology.world.generator.plugin.RegisterPlugin;

import java.util.Arrays;

/**
 * @author Marcin Sciesinski <marcins78@gmail.com>
 */
@RegisterPlugin
public class FlowerPlainsSpawnDefinition extends StaticBlockFloraSpawnDefinition {
    public FlowerPlainsSpawnDefinition() {
        super(PlantType.GRASS, PlainsBiome.ID, 0.5f, 1f, "Core:Flower",
                Arrays.asList(new BlockUri("Core:Dandelion"), new BlockUri("Core:GlowbellBloom"), new BlockUri("Core:Iris"),
                        new BlockUri("Core:Lavender"), new BlockUri("Core:RedClover"), new BlockUri("Core:RedFlower"),
                        new BlockUri("Core:Tulip"), new BlockUri("Core:YellowFlower")),
                new BlockCollectionPredicate(Blocks.getBlock("Core:Grass")), null);
    }
}
