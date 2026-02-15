<div align="center">

# 🩸 BloodEffect

### Реалистичные кровавые эффекты для Minecraft серверов
### Ссылка на ресурс: https://www.spigotmc.org/resources/bloodeffect.126191

<br>

<img src="https://img.shields.io/badge/Minecraft-1.12–1.21.x-brightgreen?style=for-the-badge">
<img src="https://img.shields.io/badge/Platform-Spigot%20%7C%20Paper-orange?style=for-the-badge">
<img src="https://img.shields.io/badge/Лёгкий-Да-success?style=for-the-badge">
<img src="https://img.shields.io/badge/Оптимизация-Высокая-blue?style=for-the-badge">

<br><br>

⚔️ Добавьте реалистичные кровавые эффекты на ваш сервер!  
Идеально подходит для режимов **PvP**, **RPG**, **DayZ** и **Survival**.

<br>

<a href="https://www.spigotmc.org/resources/bloodeffect.126191/" target="_blank">
<img src="https://img.shields.io/badge/Скачать%20на-SpigotMC-orange?style=for-the-badge">
</a>

</div>

---

## ✨ Возможности

- 🩸 Реалистичные эффекты крови при получении урона  
- ⚔️ Усиливает атмосферу PvP  
- 🧟 Отлично подходит для RPG и DayZ серверов  
- 🎯 Поддержка снарядов (стрелы, снежки и др.)  
- 🔫 Интеграция с CrackShot  
- ⚙ Полная настройка через конфигурацию  
- 🚀 Лёгкий и оптимизированный  
- 🔄 Перезагрузка без перезапуска сервера  
- ✅ Совместимость с Minecraft **1.12 – 1.21.x**

---

## 🎮 Команды

| Команда | Описание |
|----------|----------|
| `/bloodeffect reload` | Перезагружает конфигурацию плагина |


---

## 🔐 Права

| Право | Описание |
|------------|----------|
| `bloodeffect.admin` | Разрешает перезагрузку плагина |

---

## 📦 Установка

1. Скачайте последнюю версию с SpigotMC  
2. Поместите `.jar` файл в папку `/plugins`  
3. Перезапустите сервер  
4. Настройте конфигурацию под свои нужды  

---

## ⚙ Конфигурация

```yaml
Command:
  noPermission: "&cУ вас нет прав для использования этой команды."
  pluginConfigReloaded: "&aКонфигурация плагина успешно перезагружена."
  Use: "&fИспользуйте: &c/bloodeffect reload &8- &aперезагрузить конфигурацию."

bloodEffect:
  enable: true
  blockType: 'REDSTONE_BLOCK'

player:
  enable: true
  yOffset: 1.0

mob:
  enable: false
  yOffset: 0.5

projectile:
  enable: true
  yOffset: 1.5

crackShotEffect:
  enable: false

  player:
    enable: true
    yOffset: 1.0

  mob:
    enable: false
    yOffset: 0.5

  HeadShot:
    player:
      enable: true
      yOffset: 2.0
    mob:
      enable: true
      yOffset: 1.5

