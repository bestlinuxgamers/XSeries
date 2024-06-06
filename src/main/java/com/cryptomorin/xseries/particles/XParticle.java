package com.cryptomorin.xseries.particles;

import org.bukkit.MinecraftExperimental;
import org.bukkit.Particle;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.bukkit.MinecraftExperimental.Requires;

@SuppressWarnings("UnstableApiUsage")
public enum XParticle {
    /**
     * EXPLOSION_NORMAL -> POOF (v1.20.5)
     */
    POOF("EXPLOSION_NORMAL"),
    /**
     * EXPLOSION_LARGE -> EXPLOSION (v1.20.5)
     */
    EXPLOSION("EXPLOSION_LARGE"),
    /**
     * EXPLOSION_HUGE -> EXPLOSION_EMITTER (v1.20.5)
     */
    EXPLOSION_EMITTER("EXPLOSION_HUGE"),
    /**
     * FIREWORKS_SPARK -> FIREWORK (v1.20.5)
     */
    FIREWORK("FIREWORKS_SPARK"),
    /**
     * WATER_BUBBLE -> BUBBLE (v1.20.5)
     */
    BUBBLE("WATER_BUBBLE"),
    /**
     * WATER_SPLASH -> SPLASH (v1.20.5)
     */
    SPLASH("WATER_SPLASH"),
    /**
     * WATER_WAKE -> FISHING (v1.20.5)
     */
    FISHING("WATER_WAKE"),
    /**
     * SUSPENDED -> UNDERWATER (v1.20.5)
     */
    UNDERWATER("SUSPENDED"),
    CRIT,
    /**
     * CRIT_MAGIC -> ENCHANTED_HIT (v1.20.5)
     */
    ENCHANTED_HIT("CRIT_MAGIC"),
    /**
     * SMOKE_NORMAL -> SMOKE (v1.20.5)
     */
    SMOKE("SMOKE_NORMAL"),
    /**
     * SMOKE_LARGE -> LARGE_SMOKE (v1.20.5)
     */
    LARGE_SMOKE("SMOKE_LARGE"),
    /**
     * SPELL -> EFFECT (v1.20.5)
     */
    EFFECT("SPELL"),
    /**
     * SPELL_INSTANT -> INSTANT_EFFECT (v1.20.5)
     */
    INSTANT_EFFECT("SPELL_INSTANT"),
    /**
     * SPELL_MOB_AMBIENT -> SPELL_MOB -> ENTITY_EFFECT (v1.20.5)
     * The name was changed multiple times during the parity update
     *
     * @see <a href="https://hub.spigotmc.org/stash/projects/SPIGOT/repos/bukkit/diff/src/main/java/org/bukkit/Particle.java?until=1113e50a392b36253c4ae458a6d3d73e04841111">...</a>
     */
    ENTITY_EFFECT("SPELL_MOB", "SPELL_MOB_AMBIENT"),
    /**
     * SPELL_WITCH -> WITCH (v1.20.5)
     */
    WITCH("SPELL_WITCH"),
    /**
     * DRIP_WATER -> DRIPPING_WATER (v1.20.5)
     */
    DRIPPING_WATER("DRIP_WATER"),
    /**
     * DRIP_LAVA -> DRIPPING_LAVA (v1.20.5)
     */
    DRIPPING_LAVA("DRIP_LAVA"),
    /**
     * VILLAGER_ANGRY -> ANGRY_VILLAGER (v1.20.5)
     */
    ANGRY_VILLAGER("VILLAGER_ANGRY"),
    /**
     * VILLAGER_HAPPY -> HAPPY_VILLAGER (v1.20.5)
     */
    HAPPY_VILLAGER("VILLAGER_HAPPY"),
    /**
     * TOWN_AURA -> MYCELIUM (v1.20.5)
     */
    MYCELIUM("TOWN_AURA"),
    NOTE,
    PORTAL,
    /**
     * ENCHANTMENT_TABLE -> ENCHANT (v1.20.5)
     */
    ENCHANT("ENCHANTMENT_TABLE"),
    FLAME,
    LAVA,
    CLOUD,
    /**
     * REDSTONE -> DUST (v1.20.5)
     */
    DUST("REDSTONE"),
    /**
     * SNOWBALL, SNOW_SHOVEL -> ITEM_SNOWBALL (v1.20.5)
     */
    ITEM_SNOWBALL("SNOWBALL", "SNOW_SHOVEL"),
    /**
     * SLIME -> ITEM_SLIME (v1.20.5)
     */
    ITEM_SLIME("SLIME"),
    HEART,
    /**
     * ITEM_CRACK -> ITEM (v1.20.5)
     */
    ITEM("ITEM_CRACK"),
    BLOCK,
    /**
     * WATER_DROP -> RAIN (v1.20.5)
     */
    RAIN("WATER_DROP"),
    /**
     * MOB_APPEARANCE -> ELDER_GUARDIAN (v1.20.5)
     */
    ELDER_GUARDIAN("MOB_APPEARANCE"),
    DRAGON_BREATH,
    END_ROD,
    DAMAGE_INDICATOR,
    SWEEP_ATTACK,
    FALLING_DUST,
    /**
     * TOTEM -> TOTEM_OF_UNDYING (v1.20.5)
     */
    TOTEM_OF_UNDYING("TOTEM"),
    SPIT,
    SQUID_INK,
    BUBBLE_POP,
    CURRENT_DOWN,
    BUBBLE_COLUMN_UP,
    NAUTILUS,
    DOLPHIN,
    SNEEZE,
    CAMPFIRE_COSY_SMOKE,
    CAMPFIRE_SIGNAL_SMOKE,
    COMPOSTER,
    FLASH,
    FALLING_LAVA,
    LANDING_LAVA,
    FALLING_WATER,
    DRIPPING_HONEY,
    FALLING_HONEY,
    LANDING_HONEY,
    FALLING_NECTAR,
    SOUL_FIRE_FLAME,
    ASH,
    CRIMSON_SPORE,
    WARPED_SPORE,
    SOUL,
    DRIPPING_OBSIDIAN_TEAR,
    FALLING_OBSIDIAN_TEAR,
    LANDING_OBSIDIAN_TEAR,
    REVERSE_PORTAL,
    WHITE_ASH,
    DUST_COLOR_TRANSITION,
    VIBRATION,
    FALLING_SPORE_BLOSSOM,
    SPORE_BLOSSOM_AIR,
    SMALL_FLAME,
    SNOWFLAKE,
    DRIPPING_DRIPSTONE_LAVA,
    FALLING_DRIPSTONE_LAVA,
    DRIPPING_DRIPSTONE_WATER,
    FALLING_DRIPSTONE_WATER,
    GLOW_SQUID_INK,
    GLOW,
    WAX_ON,
    WAX_OFF,
    ELECTRIC_SPARK,
    SCRAPE,
    SONIC_BOOM,
    SCULK_SOUL,
    SCULK_CHARGE,
    SCULK_CHARGE_POP,
    SHRIEK,
    CHERRY_LEAVES,
    EGG_CRACK,
    DUST_PLUME,
    WHITE_SMOKE,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    GUST,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    SMALL_GUST,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    GUST_EMITTER_LARGE,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    GUST_EMITTER_SMALL,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    TRIAL_SPAWNER_DETECTION,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    TRIAL_SPAWNER_DETECTION_OMINOUS,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    VAULT_CONNECTION,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    INFESTED,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    ITEM_COBWEB,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    DUST_PILLAR,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    OMINOUS_SPAWNING,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    RAID_OMEN,
    @MinecraftExperimental(Requires.UPDATE_1_21)
    TRIAL_OMEN,
    BLOCK_MARKER;

    private final Particle particle;

    XParticle(String... alts) {
        Particle testParticle = tryGetParticle(this.name());
        Data.NAME_MAPPING.put(this.name(), this);

        for (String alt : alts) {
            if (testParticle == null) testParticle = tryGetParticle(alt);
            Data.NAME_MAPPING.put(alt, this);
        }

        this.particle = testParticle;
        if (particle != null) Data.BUKKIT_MAPPING.put(particle, this);
    }

    public Particle get() {
        return particle;
    }

    public boolean isSupported() {
        return particle != null;
    }

    private static Particle tryGetParticle(String particle) {
        try {
            return Particle.valueOf(particle);
        } catch (IllegalArgumentException ignored) {
            return null;
        }
    }

    public static final class Data {
        private static final Map<String, XParticle> NAME_MAPPING = new HashMap<>();
        private static final Map<Particle, XParticle> BUKKIT_MAPPING = new EnumMap<>(Particle.class);
    }

    public XParticle or(XParticle other) {
        return this.isSupported() ? this : other;
    }

    public static XParticle of(Particle particle) {
        Objects.requireNonNull(particle, "Cannot match null particle");
        XParticle mapping = Data.BUKKIT_MAPPING.get(particle);
        if (mapping != null) return mapping;
        throw new UnsupportedOperationException("Unknown particle: " + particle);
    }

    public static XParticle of(String particle) {
        Objects.requireNonNull(particle, "Cannot match null particle");
        return Data.NAME_MAPPING.get(particle);
    }
}
