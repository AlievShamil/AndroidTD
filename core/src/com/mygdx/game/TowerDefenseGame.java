package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.*;

public class TowerDefenseGame extends Game {
    private SpriteBatch batch;

    // План работ:
    // Система экранов +
    // Система ресурсов +
    // Работа с интерфейсом +
    // Работа со текстом(вывод текста, генерация шрифтов) +
    // Подгонка под разные экраны +
    // Звуки/музыка +
    // --------------------
    // TurretEmitter
    // Подкорректировать систему частиц
    // Добавить домик
    // Добавить монетки
    // Улучшение пушек
    // Портирование на андроид

    @Override
    public void create() {
        batch = new SpriteBatch();
        ScreenManager.getInstance().init(this, batch);
        ScreenManager.getInstance().changeScreen(ScreenManager.ScreenType.MENU);
    }

    @Override
    public void render() {
        float dt = Gdx.graphics.getDeltaTime();
        getScreen().render(dt);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
