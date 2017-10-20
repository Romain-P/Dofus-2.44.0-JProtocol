// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network;

import org.heat.dofus.network.SimpleNetworkComponentFactory;
import org.heat.dofus.network.NetworkType;
import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class ProtocolTypeManager extends SimpleNetworkComponentFactory<NetworkType> {
  public ProtocolTypeManager() {
    super(createNewRegister());
  }

  public static ProtocolTypeManager createNewManager() {
    return new ProtocolTypeManager();
  }

  /** A register filled with default types. This field is auto-generated via a code generator. */
  public static Map<Integer, Supplier<NetworkType>> createNewRegister() {
    Map<Integer, Supplier<NetworkType>> res = new HashMap<Integer, Supplier<NetworkType>>();

    res.put(190, com.ankamagames.dofus.network.types.game.context.fight.FightResultPvpData::new);

    res.put(
        115,
        com.ankamagames.dofus.network.types.game.context.fight.FightTeamLightInformations::new);

    res.put(488, com.ankamagames.dofus.network.types.common.basic.StatisticDataShort::new);

    res.put(
        381,
        com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations
            ::new);

    res.put(427, com.ankamagames.dofus.network.types.game.prism.AlliancePrismInformation::new);

    res.put(
        382,
        com.ankamagames.dofus.network.types.game.context.roleplay.quest
                .QuestActiveDetailedInformations
            ::new);

    res.put(407, com.ankamagames.dofus.network.types.game.context.roleplay.HumanOptionEmote::new);

    res.put(511, com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations::new);

    res.put(
        431, com.ankamagames.dofus.network.types.game.prism.AllianceInsiderPrismInformation::new);

    res.put(98, com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience::new);

    res.put(484, com.ankamagames.dofus.network.types.common.basic.StatisticData::new);

    res.put(
        447,
        com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorWaitingForHelpInformations
            ::new);

    res.put(7, com.ankamagames.dofus.network.types.game.data.items.Item::new);

    res.put(168, com.ankamagames.dofus.network.types.game.mount.ItemDurability::new);

    res.put(412, com.ankamagames.dofus.network.types.game.achievement.AchievementRewardable::new);

    res.put(
        147, com.ankamagames.dofus.network.types.game.context.TaxCollectorStaticInformations::new);

    res.put(356, com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost::new);

    res.put(
        386,
        com.ankamagames.dofus.network.types.game.context.roleplay.quest
                .QuestObjectiveInformationsWithCompletion
            ::new);

    res.put(
        425, com.ankamagames.dofus.network.types.game.context.roleplay.HumanOptionAlliance::new);

    res.put(
        466,
        com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.PortalInformation
            ::new);

    res.put(
        117, com.ankamagames.dofus.network.types.game.context.fight.FightExternalInformations::new);

    res.put(
        503,
        com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations::new);

    res.put(122, com.ankamagames.dofus.network.types.game.data.items.BidExchangerObjectInfo::new);

    res.put(221, com.ankamagames.dofus.network.types.game.house.HouseInformationsForSell::new);

    res.put(486, com.ankamagames.dofus.network.types.common.basic.StatisticDataByte::new);

    res.put(482, com.ankamagames.dofus.network.types.common.basic.StatisticDataBoolean::new);

    res.put(
        207,
        com.ankamagames.dofus.network.types.game.actions.fight.FightTemporarySpellBoostEffect::new);

    res.put(
        454,
        com.ankamagames.dofus.network.types.game.context.fight
                .GameFightFighterCompanionLightInformations
            ::new);

    res.put(
        432, com.ankamagames.dofus.network.types.game.social.AllianceVersatileInformations::new);

    res.put(397, com.ankamagames.dofus.network.types.web.krosmaster.KrosmasterFigure::new);

    res.put(
        143,
        com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations::new);

    res.put(
        180,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayMountInformations
            ::new);

    res.put(
        398,
        com.ankamagames.dofus.network.types.game.interactive.InteractiveElementWithAgeBonus::new);

    res.put(492, com.ankamagames.dofus.network.types.game.shortcut.ShortcutObjectIdolsPreset::new);

    res.put(493, com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorMovement::new);

    res.put(120, com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell::new);

    res.put(
        201,
        com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
            ::new);

    res.put(
        163,
        com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
            ::new);

    res.put(
        378,
        com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberGeoPosition
            ::new);

    res.put(
        84,
        com.ankamagames.dofus.network.types.game.context.fight.FightResultTaxCollectorListEntry
            ::new);

    res.put(111, com.ankamagames.dofus.network.types.game.house.HouseInformations::new);

    res.put(
        483, com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity::new);

    res.put(
        448,
        com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorComplementaryInformations
            ::new);

    res.put(
        186, com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo::new);

    res.put(
        426,
        com.ankamagames.dofus.network.types.game.context.fight
                .FightTeamMemberWithAllianceCharacterInformations
            ::new);

    res.put(85, com.ankamagames.dofus.network.types.game.actions.fight.GameActionMarkedCell::new);

    res.put(405, com.ankamagames.dofus.network.types.game.look.IndexedEntityLook::new);

    res.put(
        205, com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown::new);

    res.put(
        444,
        com.ankamagames.dofus.network.types.game.character.CharacterMinimalAllianceInformations
            ::new);

    res.put(
        4,
        com.ankamagames.dofus.network.types.game.character.characteristic
                .CharacterBaseCharacteristic
            ::new);

    res.put(167, com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations::new);

    res.put(
        194,
        com.ankamagames.dofus.network.types.game.context.roleplay.job
                .JobCrafterDirectoryEntryPlayerInfo
            ::new);

    res.put(424, com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations::new);

    res.put(92, com.ankamagames.dofus.network.types.game.friend.FriendOnlineInformations::new);

    res.put(
        177,
        com.ankamagames.dofus.network.types.game.context.fight
                .FightTeamMemberTaxCollectorInformations
            ::new);

    res.put(
        100,
        com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescriptionCraft
            ::new);

    res.put(
        422,
        com.ankamagames.dofus.network.types.game.social.AlliancedGuildFactSheetInformations::new);

    res.put(438, com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo::new);

    res.put(434, com.ankamagames.dofus.network.types.game.prism.PrismGeolocalizedInformation::new);

    res.put(157, com.ankamagames.dofus.network.types.game.context.roleplay.HumanInformations::new);

    res.put(
        439,
        com.ankamagames.dofus.network.types.game.context.fight.FightAllianceTeamInformations::new);

    res.put(
        44,
        com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations::new);

    res.put(
        391,
        com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberArenaInformations
            ::new);

    res.put(
        494,
        com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice::new);

    res.put(489, com.ankamagames.dofus.network.types.game.idol.Idol::new);

    res.put(
        465,
        com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStepDig
            ::new);

    res.put(174, com.ankamagames.dofus.network.types.game.context.MapCoordinates::new);

    res.put(
        217,
        com.ankamagames.dofus.network.types.game.context.FightEntityDispositionInformations::new);

    res.put(184, com.ankamagames.dofus.network.types.game.paddock.MountInformationsForPaddock::new);

    res.put(33, com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations::new);

    res.put(
        158,
        com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterNamedInformations
            ::new);

    res.put(
        417, com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations::new);

    res.put(164, com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid::new);

    res.put(
        6,
        com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberMonsterInformations
            ::new);

    res.put(
        192, com.ankamagames.dofus.network.types.game.context.fight.FightResultExperienceData::new);

    res.put(
        129,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayMerchantInformations
            ::new);

    res.put(
        469, com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam::new);

    res.put(
        215,
        com.ankamagames.dofus.network.types.game.character.characteristic.CharacterSpellModification
            ::new);

    res.put(
        452,
        com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                .PartyCompanionMemberInformations
            ::new);

    res.put(408, com.ankamagames.dofus.network.types.game.context.roleplay.HumanOptionTitle::new);

    res.put(380, com.ankamagames.dofus.network.types.game.friend.AbstractContactInformations::new);

    res.put(16, com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry::new);

    res.put(
        352, com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInNpcShop::new);

    res.put(
        462,
        com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStepFight
            ::new);

    res.put(
        70, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectInteger::new);

    res.put(
        413,
        com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations
            ::new);

    res.put(
        468,
        com.ankamagames
                .dofus
                .network
                .types
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntStepFollowDirection
            ::new);

    res.put(
        400, com.ankamagames.dofus.network.types.game.character.AbstractCharacterInformation::new);

    res.put(
        387,
        com.ankamagames.dofus.network.types.game.data.items.ObjectItemInformationWithQuantity::new);

    res.put(
        394,
        com.ankamagames.dofus.network.types.game.context.roleplay
                .AlternativeMonstersInGroupLightInformations
            ::new);

    res.put(
        82, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectMinMax::new);

    res.put(
        3,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayMutantInformations
            ::new);

    res.put(370, com.ankamagames.dofus.network.types.game.shortcut.ShortcutObjectPreset::new);

    res.put(
        436, com.ankamagames.dofus.network.types.game.approach.ServerSessionConstantString::new);

    res.put(
        419,
        com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations::new);

    res.put(
        453,
        com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                .PartyCompanionBaseInformations
            ::new);

    res.put(
        384,
        com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag
            ::new);

    res.put(
        198, com.ankamagames.dofus.network.types.game.context.roleplay.ObjectItemInRolePlay::new);

    res.put(
        456,
        com.ankamagames.dofus.network.types.game.context.fight
                .GameFightFighterNamedLightInformations
            ::new);

    res.put(
        220,
        com.ankamagames.dofus.network.types.game.interactive.InteractiveElementNamedSkill::new);

    res.put(
        446, com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorGuildInformations::new);

    res.put(
        20, com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations::new);

    res.put(
        36,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayCharacterInformations
            ::new);

    res.put(
        169,
        com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorFightersInformation::new);

    res.put(428, com.ankamagames.dofus.network.types.game.prism.PrismInformation::new);

    res.put(
        150, com.ankamagames.dofus.network.types.game.context.GameContextActorInformations::new);

    res.put(435, com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations::new);

    res.put(119, com.ankamagames.dofus.network.types.game.data.items.ObjectItemQuantity::new);

    res.put(392, com.ankamagames.dofus.network.types.game.context.MapCoordinatesAndId::new);

    res.put(
        81, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectLadder::new);

    res.put(
        107,
        com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations
            ::new);

    res.put(127, com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations::new);

    res.put(
        103,
        com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescriptionTimed
            ::new);

    res.put(491, com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset::new);

    res.put(
        411, com.ankamagames.dofus.network.types.game.context.roleplay.HumanOptionOrnament::new);

    res.put(
        90,
        com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations
            ::new);

    res.put(
        191, com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData::new);

    res.put(350, com.ankamagames.dofus.network.types.updater.ContentPart::new);

    res.put(501, com.ankamagames.dofus.network.types.game.dare.DareCriteria::new);

    res.put(
        202,
        com.ankamagames.dofus.network.types.game.character.alignment
                .ActorExtendedAlignmentInformations
            ::new);

    res.put(
        43, com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations::new);

    res.put(
        203,
        com.ankamagames.dofus.network.types.game.context.fight
                .GameFightMonsterWithAlignmentInformations
            ::new);

    res.put(
        209, com.ankamagames.dofus.network.types.game.actions.fight.FightTemporaryBoostEffect::new);

    res.put(
        500,
        com.ankamagames.dofus.network.types.game.context.roleplay.job.JobBookSubscription::new);

    res.put(176, com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended::new);

    res.put(
        212,
        com.ankamagames.dofus.network.types.game.character.choice.CharacterToRecolorInformation
            ::new);

    res.put(88, com.ankamagames.dofus.network.types.game.guild.GuildMember::new);

    res.put(
        464,
        com.ankamagames.dofus.network.types.game.context.roleplay
                .GameRolePlayGroupMonsterWaveInformations
            ::new);

    res.put(73, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectDice::new);

    res.put(
        449, com.ankamagames.dofus.network.types.game.context.roleplay.HumanOptionObjectUse::new);

    res.put(504, com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations::new);

    res.put(
        154,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayNamedActorInformations
            ::new);

    res.put(123, com.ankamagames.dofus.network.types.game.data.items.GoldItem::new);

    res.put(
        420,
        com.ankamagames.dofus.network.types.game.context.roleplay.GuildInAllianceInformations::new);

    res.put(508, com.ankamagames.dofus.network.types.game.paddock.PaddockGuildedInformations::new);

    res.put(
        421, com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations::new);

    res.put(
        206,
        com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect::new);

    res.put(
        193,
        com.ankamagames.dofus.network.types.game.character
                .CharacterMinimalPlusLookAndGradeInformations
            ::new);

    res.put(497, com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts::new);

    res.put(
        440,
        com.ankamagames.dofus.network.types.game.context.TaxCollectorStaticExtendedInformations
            ::new);

    res.put(11, com.ankamagames.dofus.network.types.version.Version::new);

    res.put(130, com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations::new);

    res.put(
        97,
        com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectorySettings
            ::new);

    res.put(
        473,
        com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntFlag
            ::new);

    res.put(121, com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor::new);

    res.put(371, com.ankamagames.dofus.network.types.game.shortcut.ShortcutObjectItem::new);

    res.put(505, com.ankamagames.dofus.network.types.game.dare.DareReward::new);

    res.put(
        475,
        com.ankamagames.dofus.network.types.game.character.choice
                .AbstractCharacterToRefurbishInformation
            ::new);

    res.put(
        196,
        com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryListEntry
            ::new);

    res.put(
        8,
        com.ankamagames.dofus.network.types.game.character.characteristic
                .CharacterCharacteristicsInformations
            ::new);

    res.put(
        471,
        com.ankamagames.dofus.network.types.game.context.roleplay
                .GameRolePlayTreasureHintInformations
            ::new);

    res.put(355, com.ankamagames.dofus.network.types.game.inventory.preset.Preset::new);

    res.put(485, com.ankamagames.dofus.network.types.common.basic.StatisticDataInt::new);

    res.put(430, com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant::new);

    res.put(
        46,
        com.ankamagames.dofus.network.types.game.context.fight.GameFightCharacterInformations::new);

    res.put(
        216,
        com.ankamagames.dofus.network.types.game.context.fight.FightResultMutantListEntry::new);

    res.put(55, com.ankamagames.dofus.network.types.game.look.EntityLook::new);

    res.put(
        373,
        com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer
            ::new);

    res.put(
        366,
        com.ankamagames.dofus.network.types.game.actions.fight.FightTemporarySpellImmunityEffect
            ::new);

    res.put(363, com.ankamagames.dofus.network.types.game.achievement.Achievement::new);

    res.put(487, com.ankamagames.dofus.network.types.common.basic.StatisticDataString::new);

    res.put(
        477,
        com.ankamagames.dofus.network.types.game.character.choice.CharacterToRemodelInformations
            ::new);

    res.put(
        463,
        com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStep
            ::new);

    res.put(506, com.ankamagames.dofus.network.types.game.finishmoves.FinishMoveInformations::new);

    res.put(
        437,
        com.ankamagames.dofus.network.types.game.social.GuildInAllianceVersatileInformations::new);

    res.put(393, com.ankamagames.dofus.network.types.version.VersionExtended::new);

    res.put(
        399,
        com.ankamagames.dofus.network.types.game.character.choice.CharacterToRelookInformation
            ::new);

    res.put(
        116,
        com.ankamagames.dofus.network.types.game.context.fight.AbstractFightTeamInformations::new);

    res.put(510, com.ankamagames.dofus.network.types.game.house.HouseOnMapInformations::new);

    res.put(
        208,
        com.ankamagames.dofus.network.types.game.action.fight
                .FightDispellableEffectExtendedInformations
            ::new);

    res.put(
        124, com.ankamagames.dofus.network.types.game.data.items.ObjectItemMinimalInformation::new);

    res.put(
        24, com.ankamagames.dofus.network.types.game.context.fight.FightResultPlayerListEntry::new);

    res.put(
        161,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayPrismInformations
            ::new);

    res.put(108, com.ankamagames.dofus.network.types.game.interactive.StatedElement::new);

    res.put(
        96, com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations::new);

    res.put(377, com.ankamagames.dofus.network.types.secure.TrustCertificate::new);

    res.put(
        140,
        com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
            ::new);

    res.put(63, com.ankamagames.dofus.network.types.game.context.EntityMovementInformations::new);

    res.put(25, com.ankamagames.dofus.network.types.connection.GameServerInformations::new);

    res.put(
        141,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
            ::new);

    res.put(
        48,
        com.ankamagames.dofus.network.types.game.context.fight.GameFightTaxCollectorInformations
            ::new);

    res.put(219, com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill::new);

    res.put(
        372, com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorLootInformations::new);

    res.put(
        450,
        com.ankamagames.dofus.network.types.game.context.fight.GameFightCompanionInformations::new);

    res.put(
        479,
        com.ankamagames.dofus.network.types.game.character.choice.CharacterRemodelingInformation
            ::new);

    res.put(
        364, com.ankamagames.dofus.network.types.game.context.fight.GameFightResumeSlaveInfo::new);

    res.put(357, com.ankamagames.dofus.network.types.game.mount.UpdateMountIntBoost::new);

    res.put(
        472,
        com.ankamagames
                .dofus
                .network
                .types
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntStepFollowDirectionToHint
            ::new);

    res.put(
        418,
        com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
            ::new);

    res.put(
        93, com.ankamagames.dofus.network.types.game.friend.FriendSpouseOnlineInformations::new);

    res.put(
        110, com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations::new);

    res.put(
        396,
        com.ankamagames.dofus.network.types.game.context.roleplay
                .GroupMonsterStaticInformationsWithAlternatives
            ::new);

    res.put(170, com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild::new);

    res.put(
        445,
        com.ankamagames.dofus.network.types.game.character.CharacterMinimalGuildInformations::new);

    res.put(
        165,
        com.ankamagames.dofus.network.types.game.guild.tax.AdditionalTaxCollectorInformations::new);

    res.put(
        481,
        com.ankamagames.dofus.network.types.game.context.roleplay.job.DecraftedItemStackInfo::new);

    res.put(
        383,
        com.ankamagames.dofus.network.types.game.context.roleplay
                .GameRolePlayNpcWithQuestInformations
            ::new);

    res.put(76, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect::new);

    res.put(
        365, com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations::new);

    res.put(368, com.ankamagames.dofus.network.types.game.shortcut.ShortcutSpell::new);

    res.put(105, com.ankamagames.dofus.network.types.game.friend.IgnoredOnlineInformations::new);

    res.put(106, com.ankamagames.dofus.network.types.game.friend.IgnoredInformations::new);

    res.put(31, com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats::new);

    res.put(443, com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation::new);

    res.put(512, com.ankamagames.dofus.network.types.game.house.HouseGuildedInformations::new);

    res.put(
        214,
        com.ankamagames.dofus.network.types.game.actions.fight.FightTemporaryBoostStateEffect::new);

    res.put(
        509, com.ankamagames.dofus.network.types.game.paddock.PaddockInstancesInformations::new);

    res.put(52, com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject::new);

    res.put(404, com.ankamagames.dofus.network.types.game.achievement.AchievementObjective::new);

    res.put(
        175,
        com.ankamagames.dofus.network.types.game.context.roleplay.AtlasPointsInformations::new);

    res.put(
        151, com.ankamagames.dofus.network.types.game.context.fight.GameFightAIInformations::new);

    res.put(210, com.ankamagames.dofus.network.types.game.actions.fight.FightTriggeredEffect::new);

    res.put(54, com.ankamagames.dofus.network.types.game.look.SubEntity::new);

    res.put(
        455,
        com.ankamagames.dofus.network.types.game.context.fight
                .GameFightFighterMonsterLightInformations
            ::new);

    res.put(
        410, com.ankamagames.dofus.network.types.game.context.roleplay.HumanOptionFollowers::new);

    res.put(
        74, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectString::new);

    res.put(
        499,
        com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos::new);

    res.put(
        75, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectDuration::new);

    res.put(134, com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer::new);

    res.put(498, com.ankamagames.dofus.network.types.game.guild.HavenBagFurnitureInformation::new);

    res.put(409, com.ankamagames.dofus.network.types.game.context.roleplay.HumanOptionGuild::new);

    res.put(
        395,
        com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations
            ::new);

    res.put(353, com.ankamagames.dofus.network.types.game.context.ActorOrientation::new);

    res.put(87, com.ankamagames.dofus.network.types.game.guild.GuildEmblem::new);

    res.put(37, com.ankamagames.dofus.network.types.game.data.items.ObjectItem::new);

    res.put(
        374,
        com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations
            ::new);

    res.put(
        144,
        com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations::new);

    res.put(222, com.ankamagames.dofus.network.types.game.paddock.PaddockInformationsForSell::new);

    res.put(
        160,
        com.ankamagames.dofus.network.types.game.context.roleplay
                .GameRolePlayGroupMonsterInformations
            ::new);

    res.put(
        29,
        com.ankamagames.dofus.network.types.game.context.fight.GameFightMonsterInformations::new);

    res.put(
        423,
        com.ankamagames.dofus.network.types.game.social.GuildInsiderFactSheetInformations::new);

    res.put(
        433, com.ankamagames.dofus.network.types.game.approach.ServerSessionConstantInteger::new);

    res.put(49, com.ankamagames.dofus.network.types.game.data.items.SpellItem::new);

    res.put(
        470,
        com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeamWithOutcome
            ::new);

    res.put(415, com.ankamagames.dofus.network.types.game.character.status.PlayerStatus::new);

    res.put(101, com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription::new);

    res.put(77, com.ankamagames.dofus.network.types.game.friend.FriendSpouseInformations::new);

    res.put(
        467,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayPortalInformations
            ::new);

    res.put(178, com.ankamagames.dofus.network.types.game.mount.MountClientData::new);

    res.put(200, com.ankamagames.dofus.network.types.game.interactive.MapObstacle::new);

    res.put(
        13,
        com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberCharacterInformations
            ::new);

    res.put(
        359,
        com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInHumanVendorShop::new);

    res.put(41, com.ankamagames.dofus.network.types.game.context.fight.FightLoot::new);

    res.put(429, com.ankamagames.dofus.network.types.game.approach.ServerSessionConstantLong::new);

    res.put(
        189,
        com.ankamagames.dofus.network.types.game.context.fight.FightResultFighterListEntry::new);

    res.put(
        385,
        com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestObjectiveInformations
            ::new);

    res.put(
        102,
        com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription::new);

    res.put(354, com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem::new);

    res.put(132, com.ankamagames.dofus.network.types.game.paddock.PaddockInformations::new);

    res.put(
        50,
        com.ankamagames.dofus.network.types.game.context.fight.GameFightMutantInformations::new);

    res.put(416, com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos::new);

    res.put(490, com.ankamagames.dofus.network.types.game.idol.PartyIdol::new);

    res.put(
        211,
        com.ankamagames.dofus.network.types.game.actions.fight
                .FightTemporaryBoostWeaponDamagesEffect
            ::new);

    res.put(
        360,
        com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStatsPreparation
            ::new);

    res.put(502, com.ankamagames.dofus.network.types.game.dare.DareInformations::new);

    res.put(
        99,
        com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescriptionCollect
            ::new);

    res.put(
        60, com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations::new);

    res.put(78, com.ankamagames.dofus.network.types.game.friend.FriendInformations::new);

    res.put(
        474,
        com.ankamagames.dofus.network.types.game.character.choice
                .CharacterHardcoreOrEpicInformations
            ::new);

    res.put(218, com.ankamagames.dofus.network.types.game.house.HouseInformationsInside::new);

    res.put(
        461,
        com.ankamagames
                .dofus
                .network
                .types
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntStepFollowDirectionToPOI
            ::new);

    res.put(388, com.ankamagames.dofus.network.types.game.shortcut.ShortcutSmiley::new);

    res.put(
        457,
        com.ankamagames.dofus.network.types.game.context.fight
                .GameFightFighterTaxCollectorLightInformations
            ::new);

    res.put(
        376,
        com.ankamagames.dofus.network.types.game.context.roleplay.party
                .PartyInvitationMemberInformations
            ::new);

    res.put(
        414, com.ankamagames.dofus.network.types.game.character.status.PlayerStatusExtended::new);

    res.put(
        204,
        com.ankamagames.dofus.network.types.game.character.restriction.ActorRestrictionsInformations
            ::new);

    res.put(
        480, com.ankamagames.dofus.network.types.game.character.choice.RemodelingInformation::new);

    res.put(
        402, com.ankamagames.dofus.network.types.game.achievement.AchievementStartedObjective::new);

    res.put(
        513, com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions::new);

    res.put(
        495, com.ankamagames.dofus.network.types.game.context.roleplay.HumanOptionSkillUse::new);

    res.put(185, com.ankamagames.dofus.network.types.game.paddock.PaddockItem::new);

    res.put(
        156,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayNpcInformations::new);

    res.put(80, com.ankamagames.dofus.network.types.game.interactive.InteractiveElement::new);

    res.put(72, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectDate::new);

    res.put(369, com.ankamagames.dofus.network.types.game.shortcut.Shortcut::new);

    res.put(
        179, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectMount::new);

    res.put(390, com.ankamagames.dofus.network.types.game.house.AccountHouseInformations::new);

    res.put(
        71, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectCreature::new);

    res.put(389, com.ankamagames.dofus.network.types.game.shortcut.ShortcutEmote::new);

    res.put(351, com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark::new);

    res.put(
        148,
        com.ankamagames.dofus.network.types.game.context.GameRolePlayTaxCollectorInformations::new);

    res.put(406, com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption::new);

    res.put(
        45,
        com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations::new);

    res.put(
        451,
        com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberCompanionInformations
            ::new);

    res.put(367, com.ankamagames.dofus.network.types.game.shortcut.ShortcutObject::new);

    res.put(
        159,
        com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayHumanoidInformations
            ::new);

    res.put(183, com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations::new);

    res.put(
        195,
        com.ankamagames.dofus.network.types.game.context.roleplay.job
                .JobCrafterDirectoryEntryJobInfo
            ::new);

    return res;
  }
}
