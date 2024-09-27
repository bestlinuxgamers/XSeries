package com.cryptomorin.xseries.profiles.objects;

import com.cryptomorin.xseries.profiles.exceptions.ProfileException;
import com.cryptomorin.xseries.profiles.objects.transformer.ProfileTransformer;
import com.mojang.authlib.GameProfile;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/**
 * Ideally this should've been an abstract class with finalized methods,
 * but we usually need another abstract class and Java can't have multiple ones.
 */
@ApiStatus.Internal
public interface DelegateProfileable extends Profileable {
    Profileable getDelegateProfile();

    @Override
    @Nullable
    @Unmodifiable
    default GameProfile getProfile() {
        return getDelegateProfile().getProfile();
    }

    @Override
    default @Nullable ProfileException test() {
        return getDelegateProfile().test();
    }

    @Override
    default @Nullable GameProfile getDisposableProfile() {
        return getDelegateProfile().getDisposableProfile();
    }

    @Override
    @NotNull
    default Profileable transform(@NotNull ProfileTransformer... transformers) {
        return getDelegateProfile().transform(transformers);
    }

    @Override
    @Nullable
    default String getProfileValue() {
        return getDelegateProfile().getProfileValue();
    }
}
